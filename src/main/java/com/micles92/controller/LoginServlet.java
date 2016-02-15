package com.micles92.controller;

import com.micles92.dao.UserDao;
import com.micles92.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by lesiulol on 01.02.16.
 */
@WebServlet(urlPatterns = {"/login", "/logout"})
public class LoginServlet extends HttpServlet {
    UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        httpSession.removeAttribute("loggeduser");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        try {
          User user = userDao.findByLogin(login);
            if(user != null && password.equals(user.getPassword()) ){
                HttpSession httpSession = req.getSession();
                httpSession.setAttribute("loggeduser", user);
                Cookie[] table = req.getCookies();

                for(Cookie x: table){
                    System.out.println(x);
                }

                Cookie  cookie =new Cookie("ciasteczko", "ciastko");
                cookie.setMaxAge(10000);
                resp.addCookie(cookie);
            }

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/");
            requestDispatcher.forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //throw new ServletException("Test wyjatku");
    }
}
