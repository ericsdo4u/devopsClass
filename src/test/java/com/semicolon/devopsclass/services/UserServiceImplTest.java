package com.semicolon.devopsclass.services;

import com.semicolon.devopsclass.dtos.response.RegisterResponse;
import com.semicolon.devopsclass.dtos.request.RegisterRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void testRegisterUser(){
        RegisterRequest request = new RegisterRequest();
        request.setPassword("password");
        request.setUsername("ddon");
        RegisterResponse response = userService.register(request);
        assertEquals(response.getMessage(), "User registered successfully");
    }

}