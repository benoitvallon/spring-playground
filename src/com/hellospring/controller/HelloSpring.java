package com.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloSpring {

  @RequestMapping("/welcome")
  public ModelAndView helloWorld() {

    String message = "<h1>Hello Spring</h1>";
    return new ModelAndView("welcome", "message", message);
  }
}
