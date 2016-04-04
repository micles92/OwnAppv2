package com.micles92.controller;

import com.micles92.dao.BookDao;
import com.micles92.model.Book;
import com.micles92.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lesiulol on 21.02.16.
 */
@Controller
public class BookControler {
    @Autowired
    private BookDao bookDao;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String listBooks(Model model) throws SQLException {
        List<Book> books = bookDao.getAll();
        books.add(new Book(666, "Spring", "Bean"));
        model.addAttribute("books",books);
        return "book-list";
    }

    @RequestMapping(value = "/add-book", method = RequestMethod.GET)
    public String getCreateBookView(){

        return "book-create";
    }

    @RequestMapping(value = "/add-book", method = RequestMethod.POST)
    public String createBook
            (HttpServletRequest request,
             HttpServletResponse response,
             HttpSession session,
             @RequestParam(value = "autor", required = true) String autor,
             @RequestParam(value = "title", required = true) String title,
             @RequestParam(value = "year", required = true) int year
             ) throws SQLException {
        //String autor = request.getParameter("autor");

         Book book = new Book(year,title,autor);

    bookDao.save(book);
        return "redirect:/books";
    }

    @RequestMapping(value = "/edit-book/{id}", method = RequestMethod.GET)
    public String getEditBookView(Model model, @PathVariable("id") Integer id) throws SQLException {
        Book book = bookDao.findById(id);

        model.addAttribute("book",book);
        return "edit-book";
    }


    @RequestMapping(value = "/edit-book", method = RequestMethod.POST)
    public String editBook(
            @RequestParam(value = "id", required = true) Integer id,
            @RequestParam(value = "autor", required = true) String autor,
            @RequestParam(value = "title", required = true) String title,
            @RequestParam(value = "year", required = true) Integer year
    ) throws SQLException {
        Book book = new Book(id,autor,title,year);

        bookDao.update(book);


        return "redirect:/books";
    }

    @RequestMapping(value = "/delete-book/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("id") Integer id) throws SQLException {
        bookDao.deleteBookById(id);
        return "redirect:/books";
    }

}
