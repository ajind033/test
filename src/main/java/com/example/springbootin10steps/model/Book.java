package com.example.springbootin10steps.model;

public class Book {

	private Long id;
	private String author;
	private String name;

	public Book(Long id, String author, String name) {
		super();
		this.id = id;
		this.author = author;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
