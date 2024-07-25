package com.semicolon.africa.giveup.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteCommentRequest {
    private String commentId;
}
