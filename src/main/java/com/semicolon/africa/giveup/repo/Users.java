package com.semicolon.africa.giveup.repo;

import com.semicolon.africa.giveup.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Users extends MongoRepository<User, String> {
    User findUserByEmail(String email);
    User findUserByName(String name);
    User findUserById(String id);


}
