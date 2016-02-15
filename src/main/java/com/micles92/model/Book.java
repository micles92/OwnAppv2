package com.micles92.model;

/**
 * Created by lesiulol on 28.01.16.
 */
public class Book {
    private int id;
    private String autor;
    private String title;
    private int year;

    public Book(int year, String title, String autor) {
        this.year = year;
        this.title = title;
        this.autor = autor;
    }

    public Book(int id, String autor, String title, int year) {
        this.id = id;
        this.autor = autor;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
