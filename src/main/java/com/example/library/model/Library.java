package com.example.library.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
    private final Book book;

    @Autowired
    public Library(Book book) {
        this.book = book;
    }

    public void showBooks() {
        System.out.println(book.getBookInfo());
    }
}
