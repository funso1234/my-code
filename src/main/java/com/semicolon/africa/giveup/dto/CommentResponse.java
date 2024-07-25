package com.semicolon.africa.giveup.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentResponse {
    private String id;
    private String comment;
    private UserResponse commenter;
}
