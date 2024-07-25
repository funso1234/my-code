package com.semicolon.africa.giveup.service;

import com.semicolon.africa.giveup.dto.*;

public interface UserService {
    UserResponse signUp(UserRequest userRequest);
    CommentResponse commentToPost(CommentRequest commentRequest);
    DeleteCommentResponse deleteComment(DeleteCommentRequest commentRequest);
    SharePostResponse shareAPost(SharePostRequest sharePostRequest);
}
