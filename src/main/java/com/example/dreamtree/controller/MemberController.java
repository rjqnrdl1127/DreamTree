package com.example.dreamtree.controller;

import com.example.dreamtree.dto.MemberDto;
import com.example.dreamtree.model.Member;
import com.example.dreamtree.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    /**
     * @param session
     * @param memberDto
     */
    @PostMapping("/signIn")
    public String signIn(HttpSession session, MemberDto memberDto) {
        session.setMaxInactiveInterval(-1);
        Optional<Member> member = memberService.selectMember(memberDto.getUserId());
        session.setAttribute("member", member);

        return "index";
    }

    /**
     * @param member
     * @return
     */
    @PostMapping("/signup")
    public String signUp(MemberDto member) {
        log.info(member.toString());

        Member member1 = memberService.createMember(member);
        return "index";
    }

    /**
     * @param session
     */
    @GetMapping("/sign_out")
    public String signUp(HttpSession session) {
        session.removeAttribute("member");
        return "index";
    }
}
