package com.example.dreamtree.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberError {
    MEMBER_NOT_FOUND("회원이 없습니다."),
    USER_ID_NOT_FOUND("아이디가 없습니다."),
    USER_PASS_EQUAL("비밀번호가 틀렸습니다.");

    private final String description;
}
