package com.micles92.controller;

import com.micles92.model.User;
import com.micles92.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by lesiulol on 09.05.16.
 */
@Controller
public class RegisterControler {
    @Autowired
    UserService userService;


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegisterView(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("user")User user, RedirectAttributes redirectAttributes){
        user.setRole(User.Role.USER);
        userService.save(user);
        redirectAttributes.addFlashAttribute("registerSuccess", true);

        return "redirect:/login";
    }

}
