package com.example.BookStore.repository;

import com.example.BookStore.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Book save(Book book);
    List<Book> findAll();
    List<Book> findByAuthorStartsWith(String author);
    List<Book> findByTitleStartsWith(String title);
    void deleteAll();
    void delete(Book book);
    Optional<Book> findById(String id);
}
