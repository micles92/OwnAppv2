package com.micles92.dao;

import com.micles92.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lesiulol on 29.01.16.
 */
@Repository
public class BookDao {
    @Autowired
    private DataBase dataBase;

    public List<Book>getAll() throws SQLException {
        List<Book>books = new ArrayList<Book>();

        PreparedStatement preparedStatement = dataBase.getConnection().prepareStatement("SELECT * FROM books");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String autor = resultSet.getString(2);
            String title = resultSet.getString(3);
            int year = resultSet.getInt(4);

            books.add(new Book(id, autor, title, year));
        }

        return books;
    }

    public void save(Book book) throws SQLException {
        PreparedStatement preparedStatement = dataBase.getConnection().prepareStatement("INSERT INTO books(autor, title, year) VALUES (?, ?, ?)");

        preparedStatement.setString(1, book.getAutor());
        preparedStatement.setString(2, book.getTitle());
        preparedStatement.setInt(3, book.getYear());

        preparedStatement.executeUpdate();
    }

    public Book findById(Integer id) throws SQLException {
        PreparedStatement statement = dataBase.getConnection().prepareStatement("SELECT * FROM books WHERE id = ?");
        statement.setInt(1,id);
        ResultSet result = statement.executeQuery();
        Book book = null;

        while (result.next()){
            String autor = result.getString("autor");
            String title = result.getString("title");
            int year = result.getInt("year");

             book = new Book(id, autor, title,year);
        }
        return book;
    }

    public void update(Book book) throws SQLException {
        PreparedStatement statement = dataBase.getConnection().prepareStatement("UPDATE books SET autor = ?, title = ?, year = ? WHERE id = ?");
        statement.setString(1,book.getAutor());
        statement.setString(2,book.getTitle());
        statement.setInt(3, book.getYear());
        statement.setInt(4, book.getId());
        statement.executeUpdate();
    }

    public void deleteBookById(Integer id) throws SQLException {
        PreparedStatement statement = dataBase.getConnection().prepareStatement("DELETE FROM books WHERE id = ?");
        statement.setInt(1,id);
        statement.executeUpdate();
    }
}
