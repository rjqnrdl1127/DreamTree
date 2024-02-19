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
    @Column(name = "license_mngt_num")
    private Long licenseMngtNum;
    @Column(name = "license_yy")
    private int licenseYy;
    @Column(name = "license_nm")
    private String licenseNm;
    @Column(name = "license_type")
    private String licenseType;
    @Column(name = "license_count")
    private Long licenseCount;
    @Column(name = "receipt_start_dt")
    private Date receiptStartDt;
    @Column(name = "receipt_end_dt")
    private Date receiptEndDt;
    @Column(name = "exam_start_dt")
    private Date examStartDt;
    @Column(name = "exam_end_dt")
    private Date examEndDt;
    @Column(name = "license_description")
    private String licenseDescription;
    @Column(name = "license_read_hit")
    private String licenseReadHit;
}
