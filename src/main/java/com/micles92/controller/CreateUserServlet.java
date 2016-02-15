package com.micles92.controller;

import com.micles92.dao.UserDao;
import com.micles92.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lesiulol on 25.01.16.
 */
@WebServlet("/create-user")
public class CreateUserServlet extends HttpServlet {
    UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/user-create.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String login = req.getParameter("login");
       String email = req.getParameter("email");
       String password = req.getParameter("password");
       String repeatedpassword = req.getParameter("repeatedpassword");

        User user = new User(email, login, password);
        try {
            userDao.save(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<User>users = null;
        try {
            users = userDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        req.setAttribute("users",users);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/user-list.jsp");
        requestDispatcher.forward(req,resp);

    }
}
