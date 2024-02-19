package com.example.dreamtree.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ChatInfo {

    @Column(name = "chat_content")
    private String chatContent;

    @ManyToOne
    @JoinColumn(name = "chat_num")
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Member member;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
