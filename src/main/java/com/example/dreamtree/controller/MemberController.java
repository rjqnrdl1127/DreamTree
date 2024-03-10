package com.example.dreamtree.controller;

import com.example.dreamtree.dto.MemberDto;
import com.example.dreamtree.model.Member;
import com.example.dreamtree.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String signIn(MemberDto memberDto, HttpSession session) {
        session.setMaxInactiveInterval(-1);
        Member member = memberService.selectMemberById(memberDto.getUserId());
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

    @PostMapping("/check_id")
    public @ResponseBody boolean checkId(String userId) {
        Member member = memberService.selectMemberById(userId);
        return member != null;
    }

    @PostMapping("/check_nick")
    public @ResponseBody boolean checkNick(String userNick) {
        Member member = memberService.selectMemberByNick(userNick);
        return member != null;
    }

    @PostMapping("/my_page")
    public String myPage() {
        return "mypage";
    }

    @GetMapping("/my_page_update")
    public String updateMyPage() {
        return "mypage_update";
    }

    @PostMapping("/get_password")
    public @ResponseBody String getPassword(String userId) {
        return memberService.selectMemberById(userId).getUserPassword();
    }

    @PostMapping("/change_password")
    public String changePassword(Model model, String userId, String password) {
        Member member = memberService.selectMemberById(userId);
        member.setUserPassword(password);
        if (memberService.updateMember(userId, member)) {
            model.addAttribute("message", "비밀번호가 변경되었습니다.");
            return "/index";
        } else {
            return "/";
        }
    }
}
