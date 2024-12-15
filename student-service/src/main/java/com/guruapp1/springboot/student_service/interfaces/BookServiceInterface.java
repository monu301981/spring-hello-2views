package com.guruapp1.springboot.student_service.interfaces;

import java.util.Collection;

import com.guruapp1.springboot.student_service.models.Book;

public interface BookServiceInterface {
    public Collection<Book> getBooks();
    Book addBook(Book book);
}
