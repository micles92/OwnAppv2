package com.micles92.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lesiulol on 29.02.16.
 */
@Entity
@Table
public class Rent {
    private  Book book;
    private  User user;
    private Long id;

    public Rent(Book book, User user, Long id) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
