package com.micles92.model;

import javax.persistence.*;

/**
 * Created by lesiulol on 28.01.16.
 */
@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "AUTOR")
    private String autor;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "YEAR")
    private int year;

    public Book(int year, String title, String autor) {
        this.year = year;
        this.title = title;
        this.autor = autor;
    }

    public Book(Long id, String autor, String title, int year) {
        this.id = id;
        this.autor = autor;
        this.title = title;
        this.year = year;
    }

    public Book(Long id) {
        this.id = id;
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
