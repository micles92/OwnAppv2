package com.micles92.dao;


import com.micles92.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lesiulol on 29.01.16.
 */
@Repository
public interface BookDao extends JpaRepository<Book,Long> {

}
