package com.example.library.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
    private final Author author;

    @Autowired
    public Book(Author author) {
        this.author = author;
    }

    public String getBookInfo() {
        return "Book: Harry Potter, Author: " + author.getName();
    }
}
