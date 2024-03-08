package com.example.dreamtree.service;

import com.example.dreamtree.dto.MemberDto;
import com.example.dreamtree.model.Member;
import com.example.dreamtree.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;


    // 회원 생성
    @Transactional
    public MemberDto createMember(Member member) {
        boolean result = repository.existsByUserId(member.getUserId());

        if (!result) {
            return MemberDto.fromEntity(
                    repository.save(Member.builder()
                            .userId(member.getUserId())
                            .userPassword(member.getUserPassword())
                            .userName(member.getUserName())
                            .userNick(member.getUserNick())
                            .userMobile(member.getUserMobile())
                            .build()));
        }

        return null;
    }

    // 회원 정보 수정
    @Transactional
    public MemberDto updateMember(Member member) {
        boolean oldUser = repository.existsByUserId(member.getUserId());

        if (!oldUser) {
            return MemberDto.fromEntity(
                    repository.save(Member.builder()
                            .userId(member.getUserId())
                            .userPassword(member.getUserPassword())
                            .userName(member.getUserName())
                            .userNick(member.getUserNick())
                            .userMobile(member.getUserMobile())
                            .build()));
        }

        return null;
    }

    // 회원 조히
    @Transactional
    public MemberDto selectMember(String userId) {
        Member member = repository.findMemberByUserId(userId)
                .orElse(null);

        return MemberDto.builder()
                .userId(member.getUserId())
                .userPassword(member.getUserPassword())
                .userName(member.getUserName())
                .userNick(member.getUserNick())
                .userMobile(member.getUserMobile())
                .build();
    }


    // 회원 정보 삭제
    @Transactional
    public void deleteMember(Member member) {
        boolean oldUser = repository.existsByUserId(member.getUserId());

        if (!oldUser) {
            try {
                repository.delete(member);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
