package com.semicolon.africa.giveup.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SharePostRequest {
    private String postAuthorId;
    private String postRecipientId;
    private String postId;
}
