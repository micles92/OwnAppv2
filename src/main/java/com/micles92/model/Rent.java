package com.micles92.model;

/**
 * Created by lesiulol on 29.02.16.
 */
public class Rent {
    private  Book book;
    private  User user;
    private Integer id;

    public Rent(Book book, User user, Integer id) {
        this.book = book;
        this.user = user;
        this.id = id;
    }

    public Rent(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "book=" + book +
                ", user=" + user +
                ", id=" + id +
                '}';
    }
}
