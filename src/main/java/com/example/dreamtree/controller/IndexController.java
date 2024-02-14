package com.example.dreamtree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("hello", "Hello World!");
        return "index";
    }

    @GetMapping("/sign_in")
    public String signIn() {
        return "sign_in";
    }
}
