package com.micles92.dao;

import com.micles92.model.Book;
import com.micles92.model.Rent;
import com.micles92.model.User;
import com.mysql.fabric.xmlrpc.base.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lesiulol on 29.02.16.
 */
@Repository
public class RentDao {
    @Autowired
    private DataBase dataBase;

    public List<Rent> getAll() throws SQLException {
        List<Rent>rents = new ArrayList<Rent>();

        PreparedStatement statement = dataBase.getConnection().prepareStatement
                ("SELECT rents.id, user_id, book_id, login, email, password, autor, title, year FROM library.rents " +
                "INNER JOIN user ON user_id = user.id " +
                "INNER JOIN books ON book_id = books.id;");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            int userId = resultSet.getInt(2);
            int bookId = resultSet.getInt(3);
            String login = resultSet.getString(4);
            String email = resultSet.getString(5);
            String password = resultSet.getString(6);
            String autor = resultSet.getString(7);
            String title = resultSet.getString(8);
            int year = resultSet.getInt(9);


            User user = new User(userId,email,login,password);
            Book book = new Book(bookId,autor,title,year);

            rents.add(new Rent(book,user,id));
        }
        return rents;
    }

    public void deleteRentById(Integer id) throws SQLException {
        PreparedStatement statement = dataBase.getConnection().prepareStatement("DELETE FROM rents WHERE id = ?");
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    public void save(Rent rent) throws SQLException {
        PreparedStatement statement = dataBase.getConnection().prepareStatement("INSERT INTO rents(user_id,book_id)  VALUES(?, ?)");
        statement.setInt(1, rent.getUser().getId()); // problem.
        statement.setInt(2, rent.getBook().getId());
        statement.executeUpdate();
    }
}
