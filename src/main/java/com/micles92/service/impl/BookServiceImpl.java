package com.micles92.service.impl;

import com.micles92.dao.BookDao;
import com.micles92.model.Book;
import com.micles92.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lesiulol on 14.04.16.
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    public List<Book> findAll() {
        return bookDao.findAll();
    }

    public void save(Book book) {
        bookDao.save(book);
    }

    public Book findOne(Long id) {
        return bookDao.findOne(id);
    }

    public void delete(Long id) {
        bookDao.delete(id);
    }
}
