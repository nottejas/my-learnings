package com.example.management.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.management.entitiy.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
