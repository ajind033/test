package com.example.springbootin10steps.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootin10steps.model.Book;

@RestController
public class BookControllor {

	@GetMapping("/books")
	public List<Book> getBooks(){
		
		return Arrays.asList(new Book(1l, "Auth1", "Name1"),new Book(2l, "Auth2", "Name2"));
	}
}
