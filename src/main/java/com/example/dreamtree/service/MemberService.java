package com.example.dreamtree.service;

import com.example.dreamtree.dto.MemberDto;
import com.example.dreamtree.model.Member;
import com.example.dreamtree.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;

    public Member selectMemberById(String userId) {
        return repository.findMemberByUserId(userId).get();
    }

    public Member selectMemberByNick(String userNick) {
        return repository.findMemberByUserNick(userNick).get();
    }

    public Member createMember(MemberDto member) {
        Member member1 = Member.builder()
                .userId(member.getUserId())
                .userPassword(member.getUserPassword())
                .userName(member.getUserName())
                .userNick(member.getUserNick())
                .userMobile(member.getUserMobile())
                .createdAt(LocalDateTime.now())
                .build();

        return repository.save(member1);
    }

    @Transactional
    public boolean updateMember(String userId, Member member) {
        Member selected = repository.findMemberByUserId(userId)
                .orElseThrow(() -> new IllegalArgumentException("해당 회원이 없습니다." + userId));
        if (selected != null) {
            repository.save(member);
            return true;
        }
        return false;
    }


    public String deleteMember(String userId) {
        Member member = repository.findMemberByUserId(userId)
                .orElseThrow(() -> new IllegalArgumentException("해당 회원이 없습니다." + userId));

        if (member !=null) {
            repository.delete(member);
            return "회원이 삭제되었습니다.";
        }
        return "해당 회원이 없습니다.";
    }
}
