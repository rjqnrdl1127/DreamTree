package com.example.dreamtree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index.html";
    }

    @GetMapping("/sign_in")
    public String signIn() {
        return "sign_in";
    }
}