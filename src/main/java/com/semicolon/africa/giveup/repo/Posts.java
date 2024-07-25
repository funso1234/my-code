package com.semicolon.africa.giveup.repo;

import com.semicolon.africa.giveup.data.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Posts extends MongoRepository<Post, String> {
    Post findPostById(String id);
}
