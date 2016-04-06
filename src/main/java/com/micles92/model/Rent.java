package com.micles92.model;

import javax.persistence.*;

/**
 * Created by lesiulol on 29.02.16.
 */
@Entity
@Table(name = "RENT")
public class Rent {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOK_ID", referencedColumnName = "ID", nullable = false)
    private  Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID", nullable = false)
    private  User user;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    public Rent() {
    }

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
