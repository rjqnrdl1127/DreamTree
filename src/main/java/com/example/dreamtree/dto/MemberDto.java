package com.example.dreamtree.dto;

import com.example.dreamtree.model.Member;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {

    private Long id;
    private String username;
    private String password;
    private String name;
    private String nickName;
    private String email;
    private String phoneNumber;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public static MemberDto fromEmpty(Member member) {
        return MemberDto.builder()
                .username(member.getUsername())
                .password(member.getPassword())
                .name(member.getName())
                .nickName(member.getNickName())
                .phoneNumber(member.getPhoneNumber())
                .build();
    }
}
