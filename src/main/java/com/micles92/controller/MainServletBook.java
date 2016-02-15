package com.micles92.controller;

import com.micles92.dao.BookDao;
import com.micles92.model.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lesiulol on 29.01.16.
 */
@WebServlet("/books")
public class MainServletBook extends HttpServlet {
    private BookDao bookDao = new BookDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = null;

        try {
            books = bookDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        req.setAttribute("books", books);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/book-list.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
