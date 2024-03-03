package com.example.dreamtree.controller;

import com.example.dreamtree.model.Member;
import com.example.dreamtree.service.MemberService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    // @PostMapping("/login")
    // public Member sign_in() {
    // memberService.
    // }

    // @PostMapping("/sign_up")
    // public Member sign_up() {

    // }
}
