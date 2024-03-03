package com.example.dreamtree.service;

import com.example.dreamtree.dto.MemberDto;
import com.example.dreamtree.model.Member;
import com.example.dreamtree.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;
    private final PasswordEncoder passwordEncoder;

    @SuppressWarnings("null")
    @Transactional
    public MemberDto createMember(Member member) {
        String password = member.getUserPassword();
        boolean result = repository.existsByUserId(member.getUserId());

        if (!result) {
            return MemberDto.fromEntity(
                    repository.save(Member.builder()
                            .userId(member.getUserId())
                            .userPassword(passwordEncoder.encode(password))
                            .userName(member.getUserName())
                            .userNick(member.getUserNick())
                            .userMobile(member.getUserMobile())
                            .build()));
        }

        return null;
    }

}
