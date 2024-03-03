package com.example.dreamtree.repository;

import com.example.dreamtree.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CertificationRepository extends JpaRepository<Certification, Long> {

    List<Certification> findTop3ByOrderByExamStartDtAsc();
}
