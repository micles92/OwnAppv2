package com.micles92.controller;

import com.micles92.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lesiulol on 20.01.16.
 */
@WebServlet("/users")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = new ArrayList<User>();

        users.add(new User("lesiulol@o2.pl","lesiulol", "admin" ));
        users.add(new User("admin@o2.pl","admin", "admin" ));
        users.add(new User("lesiulol123123@o2.pl","lesiul213ol", "admin" ));


        req.setAttribute("users",users); //dokladnie danych do Requesta

        System.out.println("DoGet Mainservlet");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/user-list.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
