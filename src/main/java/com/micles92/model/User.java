package com.micles92.model;

/**
 * Created by lesiulol on 20.01.16.
 */
public class User {
    private int id;
    private String email;
    private String login;
    private String password;

    public User(String email, String login, String password) {
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public User(int id, String email, String login, String password) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public User(int id) {
        this.id = id;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
