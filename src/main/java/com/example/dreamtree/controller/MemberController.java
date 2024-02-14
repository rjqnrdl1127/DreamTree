package com.example.dreamtree.controller;

import com.example.dreamtree.model.Member;
import com.example.dreamtree.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @PostMapping("/member/create")
    public void createMember(@RequestParam Member member) {
        service.createMember(member);
    }
}
