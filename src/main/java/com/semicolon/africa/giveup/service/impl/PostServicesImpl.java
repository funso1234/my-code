package com.semicolon.africa.giveup.service.impl;

import com.semicolon.africa.giveup.data.model.Post;
import com.semicolon.africa.giveup.repo.Posts;
import com.semicolon.africa.giveup.service.PostServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PostServicesImpl implements PostServices {
    private final Posts posts;


    @Override
    public Post addPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        return posts.save(post);
    }

    @Override
    public Post updatePost(String id, String newTitle, String newContent) {
        Post post =posts.findPostById(id);
        post.setTitle(newTitle);
        post.setContent(newContent);
        return posts.save(post);
    }

    @Override
    public String deletePost(String id) {
        Post post = posts.findPostById(id);
        posts.delete(post);
        return "post deleted";
    }

    @Override
    public List<Post> getAllPosts() {
        return posts.findAll();
    }
}
