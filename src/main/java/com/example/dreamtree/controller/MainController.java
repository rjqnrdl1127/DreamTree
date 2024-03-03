package com.example.dreamtree.controller;

import com.example.dreamtree.service.CertificationService;
import com.example.dreamtree.service.CommunityService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {

    private final CertificationService certificationService;
    private final CommunityService communityService;

    @GetMapping("/index")
    public String index(Model model) {

        model.addAttribute("certifications",
                certificationService.selectTopThree());

        return "index.html";
    }

    @GetMapping("/sign_in")
    public String signIn() {
        return "sign_in";
    }
}
