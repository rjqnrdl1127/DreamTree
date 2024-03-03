package com.example.dreamtree.repository;

import com.example.dreamtree.model.Community;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommunityRepository extends JpaRepository<Community, Long> {

    List<Community> findTop3ByUserNickOrderByCreatedAtAsc(String userNick);
}
