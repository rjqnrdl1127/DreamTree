package com.example.dreamtree.service;

import com.example.dreamtree.model.Certification;
import com.example.dreamtree.repository.CertificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CertificationService {

    private final CertificationRepository repository;

    public List<Certification> selectTopThree() {
        return repository
                .findTop3ByOrderByExamStartDtAsc()
                .stream()
                .toList();
    }
}
