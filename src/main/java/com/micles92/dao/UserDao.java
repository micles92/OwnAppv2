package com.micles92.dao;

import com.micles92.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lesiulol on 25.01.16.
 */
public class UserDao {
    private DataBase dataBase = new DataBase();

    public List<User>getAll() throws SQLException {
        List<User>users = new ArrayList<User>();

        PreparedStatement statement = dataBase.getConnection().prepareStatement("SELECT * FROM user");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String login = resultSet.getString(2);
            String email = resultSet.getString(3);
            String password = resultSet.getString(4);

            users.add(new User(id, email, login, password));
        }

        return users;
    }

    public void save(User user) throws SQLException {

            PreparedStatement statement = dataBase.getConnection().prepareStatement("INSERT INTO user(login,email,password) VALUES(?, ?, ?)");
            statement.setString(1,user.getLogin());
            statement.setString(2,user.getEmail());
            statement.setString(3,user.getPassword());
            statement.executeUpdate();

    }

    public User findByLogin(String login) throws SQLException {
        PreparedStatement statement = dataBase.getConnection().prepareStatement("SELECT * from user WHERE login = ?");
        statement.setString(1, login);
        ResultSet resultSet = statement.executeQuery();
        User user = null;

        while(resultSet.next()){
            String password = resultSet.getString("password");
            String email = resultSet.getString("email");
            int id = resultSet.getInt("id");

            user = new User(id,email,login,password);

        }
        return user;
    }
}
