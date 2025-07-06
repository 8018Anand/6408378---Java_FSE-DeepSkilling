package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookRepo;
	
	public void setBookRepository(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public void location() {
		System.out.println("Inside the book service");
		bookRepo.location();
		System.out.println("----------------------------");
	}
}
