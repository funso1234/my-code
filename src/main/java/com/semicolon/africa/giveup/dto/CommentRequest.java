package com.semicolon.africa.giveup.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CommentRequest {

    private String commenterId;
    private String comment;
    private String postId;
}
