package com.micles92.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lesiulol on 15.02.16.
 */
@Controller
public class MainControler {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "index";
    }
}
