package com.micles92.controller;

import com.micles92.model.Book;
import com.micles92.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lesiulol on 21.02.16.
 */
@Controller
public class BookControler {

    @Autowired
    private BookService bookService;
    
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String listBooks(Model model) throws SQLException {
        List<Book> books = bookService.findAll();
        model.addAttribute("books",books);
        return "book-list";
    }

    @RequestMapping(value = "/add-book", method = RequestMethod.GET)
    public String getCreateBookView(Model model){
        model.addAttribute("book", new Book());

        return "book-create";
    }

    @RequestMapping(value = "/add-book", method = RequestMethod.POST)
    public String createBook(@ModelAttribute("book") Book book){


    bookService.save(book);
        return "redirect:/books";
    }

    @RequestMapping(value = "/edit-book/{id}", method = RequestMethod.GET)
    public String getEditBookView(Model model, @PathVariable("id") Long id) throws SQLException {
        Book book = bookService.findOne(id);

        model.addAttribute("book",book);
        return "edit-book";
    }


    @RequestMapping(value = "/edit-book", method = RequestMethod.POST)
    public String editBook(@ModelAttribute("book") Book book){

        bookService.save(book);

        return "redirect:/books";
    }

    @RequestMapping(value = "/delete-book/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("id") Long id) throws SQLException {
        bookService.delete(id);
        return "redirect:/books";
    }

}
