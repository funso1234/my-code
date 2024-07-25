package com.semicolon.africa.giveup.service;

import com.semicolon.africa.giveup.data.model.Post;

import java.util.List;

public interface PostServices {
    Post addPost(String title, String content);
    Post updatePost(String id, String newTitle, String newContent);
    String deletePost(String id);
    List<Post> getAllPosts();
}
