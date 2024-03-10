package com.example.dreamtree.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long year;
    private String name;
    private String type;
    private Long count;
    private Date receiptStartDate;
    private Date receiptEndDate;
    private Date examStartDate;
    private Date examEndDate;
    private String description;
    private Long readHit;
}
