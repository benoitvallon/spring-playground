package com.springplayground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyMessage {

    @RequestMapping("/message")
    public ModelAndView helloMyMessage() {

        String myMessage = "This is your message from the controller";
        return new ModelAndView("message", "message", myMessage);
    }
}
