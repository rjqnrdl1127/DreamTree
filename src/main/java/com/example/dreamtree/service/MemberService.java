package com.example.dreamtree.service;

import com.example.dreamtree.dto.MemberDto;
import com.example.dreamtree.model.Member;
import com.example.dreamtree.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private MemberRepository repository;

    @Transactional
    public MemberDto createMember(Member member) {
        Member member1 = (Member) repository.findMemberByUsername(member.getUsername());

        if (member1 != null) {
            return MemberDto.fromEmpty(
                    repository.save(Member.builder()
                            .username(member.getUsername())
                            .password(member.getPassword())
                            .name(member.getName())
                            .nickName(member.getNickName())
                            .phoneNumber(member.getPhoneNumber())
                            .build())
            );
        }

        return null;
    }

//    @Transactional
//    public void updateMember(Member member) {
//        Member member1 = (Member) repository.findMemberByUsername(member.getUsername());
//
//        if (member1 != null) {
//            return MemberDto.fromEmpty(
//                    repository.sa
//            )
//        }
//    }

}
