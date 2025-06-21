package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepo;

    public Flux<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Mono<Book> addBook(Book book) {
        return bookRepo.save(book);
    }
}
