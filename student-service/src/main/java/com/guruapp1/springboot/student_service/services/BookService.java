package com.guruapp1.springboot.student_service.services;

import java.util.Collection;

import com.guruapp1.springboot.student_service.interfaces.BookServiceInterface;
import com.guruapp1.springboot.student_service.models.Book;


public class BookService implements BookServiceInterface{
    
    @Override
    public Collection<Book> getBooks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Book addBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "BookService []";
    }
    
}