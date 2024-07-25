package com.semicolon.africa.giveup.service.impl;

import com.semicolon.africa.giveup.dto.*;
import com.semicolon.africa.giveup.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServicesImplTest {

    @Autowired
    private UserService userService;

    @Test
    void signUp(){
        UserRequest userRequest =  UserRequest.builder()
                .email("test@email.com")
                .password("123456")
                .name("username")
                .build();
        UserResponse userResponse = userService.signUp(userRequest);
        assertThat(userResponse).isNotNull();
        assertThat(userResponse.getEmail()).isEqualTo("test@email.com");
    }

    @Test
    void commentToPost(){
        CommentRequest commentRequest = CommentRequest.builder()
                .commenterId("66a183cc1ce4b2546b4167a4")
                .postId("66a187ebc1264440ae135c66")
                .comment("your post is shit!!!!!")
                .build();
        CommentResponse commentResponse=userService.commentToPost(commentRequest);
        assertThat(commentResponse.getComment()).isEqualTo("your post is shit!!!!!");
        assertThat(commentResponse).isNotNull();

    }

    @Test
    void deleteComment(){
        CommentRequest commentRequest = CommentRequest.builder()
                .commenterId("66a183cc1ce4b2546b4167a4")
                .postId("66a187ebc1264440ae135c66")
                .comment("your post is shit!!!!!")
                .build();
        CommentResponse commentResponse=userService.commentToPost(commentRequest);
        DeleteCommentRequest deleteCommentRequest=DeleteCommentRequest.builder()
                .commentId(commentResponse.getId())
                .build();
        DeleteCommentResponse deleteCommentResponse=userService.deleteComment(deleteCommentRequest);
        assertThat(deleteCommentResponse.getMessage()).isEqualTo("Comment don deleted oga");
    }






}