package com.example.dreamtree.exception;

import com.example.dreamtree.type.MemberError;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberException extends RuntimeException{
    private MemberError error;
    private String errorMessage;

    public MemberException(MemberError error) {
        this.error = error;
        this.errorMessage = error.getDescription();
    }
}
