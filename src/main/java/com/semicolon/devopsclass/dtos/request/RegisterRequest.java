package com.semicolon.devopsclass.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private long id;
    private String username;
    private String password;
}
