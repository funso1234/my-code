package com.semicolon.africa.giveup.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class User {



    private String id;
    private String name;
    private String email;
    private String password;


}
