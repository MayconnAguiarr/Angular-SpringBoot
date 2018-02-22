package com.projeto.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.library.model.Book;
import com.projeto.library.repository.BookRepositoty;

@Service
public class BookService {
	
	@Autowired
	private BookRepositoty bookRepository;
	
	public List<Book> list(){
		return bookRepository.findAll();		
	}	
}
