package com.example.dreamtree.controller;

import com.example.dreamtree.dto.MemberDto;
import com.example.dreamtree.model.Member;
import com.example.dreamtree.service.MemberService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signIn")
    public String signIn(MemberDto member) {

    }
}
