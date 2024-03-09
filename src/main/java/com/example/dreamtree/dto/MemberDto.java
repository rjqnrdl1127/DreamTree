package com.example.dreamtree.dto;

import com.example.dreamtree.model.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {

    private String userId;
    private String userPassword;
    private String userName;
    private String userNick;
    private String userMobile;

    public static Member fromEntity(Member member) {
        return Member.builder()
                .userId(member.getUserId())
                .userPassword(member.getUserPassword())
                .userName(member.getUserName())
                .userNick(member.getUserNick())
                .userMobile(member.getUserMobile())
                .build();
    }
}
