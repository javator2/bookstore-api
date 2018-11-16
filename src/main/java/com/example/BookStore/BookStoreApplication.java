package com.example.BookStore;

import com.example.BookStore.model.Book;
import com.example.BookStore.repository.BookRepository;
import com.example.BookStore.repository.InMemoryBookRepository;
import com.example.BookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Hello Spring");

		Book book1 = new Book("Java", "Autor 1");
		Book book2 = new Book("Spring", "Autor 2");

//		BookRepository bookRepository = new InMemoryBookRepository();

		bookRepository.save(book1);
		bookRepository.save(book2);

		System.out.println(bookService.getListing());
	}
}
