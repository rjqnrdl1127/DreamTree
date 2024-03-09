package com.example.dreamtree.service;

import com.example.dreamtree.dto.MemberDto;
import com.example.dreamtree.model.Member;
import com.example.dreamtree.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;

    public Optional<Member> selectMember(String userId) {
        return repository.findMemberByUserId(userId);
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

    public Member updateMember(Member member) {
        return repository.save(member);
    }

    public void deleteMember(Member member) {

        repository.delete(member);
    }
}
