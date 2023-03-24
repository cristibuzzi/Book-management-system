package org.example.repository;

import org.example.model.Reviews;
import org.example.repository.base.RepositoryImpl;

public class ReviewsRepositoryImpl extends RepositoryImpl<Reviews> implements ReviewsRepository {
    public ReviewsRepositoryImpl() {
        super(Reviews.class);
    }
}
