package com.example.dreamtree.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class MyCert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime testDate;
    private Integer grade;
    private Character pass;
    private String afterDescription;

    @ManyToOne
    private Member member;
    @OneToOne
    private Certification certification;
}
