package com.micles92.service;

import com.micles92.model.Book;

import java.util.List;

/**
 * Created by lesiulol on 14.04.16.
 */
public interface BookService {
    List<Book> findAll();

    void save(Book book);

    Book findOne(Long id);

    void delete(Long id);
}
