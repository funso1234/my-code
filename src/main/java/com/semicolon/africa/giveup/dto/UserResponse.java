package com.semicolon.africa.giveup.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder

public class UserResponse {
    private String id;
    private String name;
    private String email;
}
