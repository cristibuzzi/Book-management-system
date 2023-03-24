package org.example.repository;

import org.example.model.Author;
import org.example.repository.base.RepositoryImpl;

public class AuthorRepositoryImpl extends RepositoryImpl<Author> implements AuthorRepository {
    public AuthorRepositoryImpl() {
        super(Author.class);
    }
}
