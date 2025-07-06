package com.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookRepository br = (BookRepository) applicationContext.getBean("bookRepository");
		br.location();
		BookService bs = (BookService) applicationContext.getBean("bookService");
		bs.location();
		
	}
}
