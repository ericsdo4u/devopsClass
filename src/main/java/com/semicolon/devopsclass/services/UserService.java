package com.semicolon.devopsclass.services;

import com.semicolon.devopsclass.dtos.response.RegisterResponse;
import com.semicolon.devopsclass.dtos.request.RegisterRequest;

public interface UserService {
    RegisterResponse register(RegisterRequest request);
}
