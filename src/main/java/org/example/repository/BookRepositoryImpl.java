package org.example.repository;

import org.example.repository.base.RepositoryImpl;

import java.awt.print.Book;

public class BookRepositoryImpl extends RepositoryImpl<Book> implements BookRepository {
    public BookRepositoryImpl() {
        super(Book.class);
    }
}
