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
public class Mycert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long licenseNum;
    private Integer licenseGrade;
    private String licenseAfterDescription;
    private Character licensePassYn;
    private LocalDateTime testDt;

    @ManyToOne
    private Member member;
    @OneToOne
    private Certification certification;
}
