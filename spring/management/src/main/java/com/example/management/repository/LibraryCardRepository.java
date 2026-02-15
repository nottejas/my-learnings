package com.example.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.management.entitiy.LibraryCard;

public interface LibraryCardRepository extends JpaRepository<LibraryCard, Long> {

}
