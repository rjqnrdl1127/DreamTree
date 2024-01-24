package com.example.dreamtree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/hello")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        view.addObject("hello", "Hello World!");
        view.setViewName("index");

        return view;
    }
}
