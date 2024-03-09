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
    @Column(name = "receipt_start_dt")
    private Date receiptStartDt;
    @Column(name = "receipt_end_dt")
    private Date receiptEndDt;
    @Column(name = "exam_start_dt")
    private Date examStartDt;
    @Column(name = "exam_end_dt")
    private Date examEndDt;
    private String description;
    private Long readHit;
}
