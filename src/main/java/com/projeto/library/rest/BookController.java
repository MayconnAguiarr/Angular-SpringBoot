package com.projeto.library.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.library.model.Book;
import com.projeto.library.service.BookService;

@RestController
@RequestMapping("/livros")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	public ResponseEntity<?> list() {		
		List<Book> prints =  bookService.list();
		return new ResponseEntity<>(prints , HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody @Valid Book book) {		
		Book print = bookService.save(book);
		return new ResponseEntity<Book>(print ,HttpStatus.CREATED);
	}
}
