package com.example.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.management.entitiy.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{

}
