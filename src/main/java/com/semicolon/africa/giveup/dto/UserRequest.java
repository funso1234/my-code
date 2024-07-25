package com.semicolon.africa.giveup.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserRequest {

    private String name;
    private String email;
    private String password;
}
