package com.example.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.management.entitiy.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
