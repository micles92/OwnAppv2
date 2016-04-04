package com.micles92.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by lesiulol on 25.01.16.
 */
@Component
public class DataBase {

    private Connection connection;

    private static final String USER = "root";
    private static final String PASSWORD = "black68Sabbath";
    private static final String URL = "jdbc:mysql://localhost:3306/library";

    public DataBase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Nie mozna zaladowac drivera mySQL");
        }
    }

    public void connect() throws SQLException {
        connection =  DriverManager.getConnection(URL,USER,PASSWORD);
    }

    public Connection getConnection() throws SQLException {
        connect();
        return connection;
    }

}
