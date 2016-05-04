package com.micles92.controller;

import com.micles92.model.User;
import com.micles92.service.UserService;
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
 * Created by lesiulol on 15.02.16.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listUsers(Model model) throws SQLException {
        List<User>users = userService.findAll();


        model.addAttribute("users",users);

        return "user-list";
    }

    @RequestMapping(value = "/create-user", method = RequestMethod.GET)
    public String getCreateUserView(Model model){
        model.addAttribute("user", new User());
        return "user-create";
    }


    @RequestMapping(value = "/create-user", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user){

        userService.save(user);


        return  "redirect:/users";
    }

    @RequestMapping(value = "/edit-user/{id}", method = RequestMethod.GET)
    public String getEditUserView(Model model, @PathVariable("id") Long id) throws SQLException {

        User user = userService.findOne(id);
        model.addAttribute("user",user);


        return "edit-user";
    }

    @RequestMapping(value = "/edit-user", method = RequestMethod.POST)
    public String editUer(
            @RequestParam(value = "login", required = true) String login,
            @RequestParam(value = "email", required = true) String email,
            @RequestParam(value = "id", required = true) Long id
    ) throws SQLException {

        User user = new User(id,email,login,null);

        userService.save(user);

        return "redirect:/users";
    }

    @RequestMapping(value = "/delete-user/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") Long id) throws SQLException {
        userService.delete(id);
        return "redirect:/users";
    }

}
