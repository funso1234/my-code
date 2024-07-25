package com.semicolon.africa.giveup.service.impl;

import com.semicolon.africa.giveup.data.model.Comment;
import com.semicolon.africa.giveup.data.model.Post;
import com.semicolon.africa.giveup.data.model.User;
import com.semicolon.africa.giveup.dto.*;
import com.semicolon.africa.giveup.repo.Comments;
import com.semicolon.africa.giveup.repo.Posts;
import com.semicolon.africa.giveup.repo.Users;
import com.semicolon.africa.giveup.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserServicesImpl implements UserService {
    private final Users users;
    private final Posts posts;
    private final Comments comments;

    @Override
    public UserResponse signUp(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        users.save(user);
        return UserResponse.builder().email(userRequest.getEmail())
                .name(userRequest.getName()).build();
    }

    @Override
    public CommentResponse commentToPost(CommentRequest commentRequest) {
        Post post = posts.findPostById(commentRequest.getPostId());
        Comment comment = new Comment();
        comment.setComment(commentRequest.getComment());
        User user =users.findUserById(commentRequest.getCommenterId());
        comment.setCommenter(users.findUserById(commentRequest.getCommenterId()));
        post.setComments(new ArrayList<>());
        post.getComments().add(comment);
        comments.save(comment);
        posts.save(post);
        return CommentResponse.builder()
                .commenter(UserResponse.builder()
                    .name(user.getName())
                    .email(user.getEmail()).build())
                .comment(commentRequest.getComment())
                .id(comment.getId())
                .build();
    }

    @Override
    public DeleteCommentResponse deleteComment(DeleteCommentRequest commentRequest) {
        comments.delete(comments.findCommentById(commentRequest.getCommentId()));
        return  DeleteCommentResponse.builder().message("Comment don deleted oga").build();
    }

    @Override
    public SharePostResponse shareAPost(SharePostRequest sharePostRequest) {
        return null;
    }
}
