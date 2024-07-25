package com.semicolon.africa.giveup.repo;

import com.semicolon.africa.giveup.data.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Comments extends MongoRepository<Comment, String> {
    Comment findCommentById(String id);
    }
