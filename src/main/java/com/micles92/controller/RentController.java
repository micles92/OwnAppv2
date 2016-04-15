package com.micles92.controller;

import com.micles92.dao.BookDao;
import com.micles92.dao.RentDao;
import com.micles92.dao.UserDao;
import com.micles92.model.Book;
import com.micles92.model.Rent;
import com.micles92.model.User;
import com.micles92.service.UserService;
import com.micles92.service.impl.BookService;
import com.micles92.service.impl.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by lesiulol on 29.02.16.
 */
@Controller
public class RentController {

    @Autowired
    private RentService rentService;
    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/rents", method = RequestMethod.GET)
    public String listRents(Model model) throws SQLException {
        List<Rent> rents = rentService.findAll();

        model.addAttribute("rents", rents);
        return "rent-list";
    }

    @RequestMapping(value = "/add-rent", method = RequestMethod.GET)
    public String getCreateRentView(Model model) throws SQLException {
       List<User> users = userService.findAll();
       List<Book> books = bookService.findAll();
        model.addAttribute("users", users);
        model.addAttribute("books", books);

     return "rent-create";
    }

    @RequestMapping(value = "/add-rent", method = RequestMethod.POST)
    public String createRent(
            @RequestParam(value = "userId", required = true) Long userId,
            @RequestParam(value = "bookId", required = true) Long bookId
    ) throws SQLException {

        Book book =new Book(bookId);
        User user = new User(userId);

        Rent rent = new Rent(book,user);

        rentService.save(rent);

        return "redirect:/rents";
    }

    @RequestMapping(value = "/delete-rent/{id}", method = RequestMethod.GET)
    public String deleteRentById(@PathVariable("id") Long id) throws SQLException {
        rentService.delete(id);
        return  "redirect:/rents";
    }
}
