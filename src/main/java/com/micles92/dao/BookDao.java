package com.micles92.dao;

import com.micles92.model.Book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lesiulol on 29.01.16.
 */
public class BookDao {
    private DataBase dataBase = new DataBase();

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

}
