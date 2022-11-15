package com.example.library.app;

import com.example.library.model.Book;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Zmierzch");
        book.setAuthor("Stephenie Meyer");
        book.setIsbn("12345678900");

        book.showInfo();
    }
}
