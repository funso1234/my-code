package com.semicolon.africa.giveup.service.impl;

import com.semicolon.africa.giveup.data.model.Post;
import com.semicolon.africa.giveup.repo.Posts;
import com.semicolon.africa.giveup.service.PostServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostServicesImplTest {


    @Autowired
    private PostServices postServices;

    @Autowired
    private Posts posts;

    @BeforeEach
    void setUp() {
        posts.deleteAll();
    }
    @Test
    void addPost() {
        Post post =postServices.addPost("title", "content");
        assertThat(post.getId()).isNotNull();
    }

    @Test
    void updatePost() {
        Post post =postServices.addPost("title", "content");
        postServices.updatePost(post.getId(),"newTitle", "newContent");
        assertThat(posts.findPostById(post.getId())).isNotNull();
        assertThat(posts.findPostById(post.getId()).getTitle()).isEqualTo("newTitle");
    }

    @Test
    void deletePost() {
        Post post =postServices.addPost("title", "content");
        postServices.deletePost(post.getId());
        assertThat(posts.findPostById(post.getId())).isNull();
    }

    @Test
    void getAllPosts() {
        Post post =postServices.addPost("title", "content");
        assertThat(postServices.getAllPosts()).hasSize(1);
    }
}