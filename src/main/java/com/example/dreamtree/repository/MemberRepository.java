package com.example.dreamtree.repository;

import com.example.dreamtree.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {

    Optional<Member> findMemberByUserId(String id);
    Optional<Member> findMemberByUserNick(String nick);
    boolean existsByUserId(String userId);
}
