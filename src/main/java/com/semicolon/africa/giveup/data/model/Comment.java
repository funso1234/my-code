package com.semicolon.africa.giveup.data.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@RequiredArgsConstructor
@Getter
@Setter

public class Comment {

    @DBRef
    private User commenter;
    private String comment;
    private String id;
}
