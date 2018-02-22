package com.projeto.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.library.model.Book;

public interface BookRepositoty extends JpaRepository<Book, Long> {

}
