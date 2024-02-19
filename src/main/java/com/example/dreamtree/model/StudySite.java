package com.example.dreamtree.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class StudySite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studySiteNum;
    private String studySiteName;
    private String studySiteUrl;
}
