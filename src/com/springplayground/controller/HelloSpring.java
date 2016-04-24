package com.springplayground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloSpring {

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {

        String message = "This is your message from the controller";
        return new ModelAndView("welcome", "message", message);
    }
}
