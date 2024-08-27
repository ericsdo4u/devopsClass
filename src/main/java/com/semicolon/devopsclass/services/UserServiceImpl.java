package com.semicolon.devopsclass.services;

import com.semicolon.devopsclass.data.model.User;
import com.semicolon.devopsclass.data.repositories.UserRepository;
import com.semicolon.devopsclass.dtos.response.RegisterResponse;
import com.semicolon.devopsclass.dtos.request.RegisterRequest;
import com.semicolon.devopsclass.exceptions.UserAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public RegisterResponse register(RegisterRequest request) {
        if (userRepository.existsById(request.getId())) {
            throw new UserAlreadyExistException("User already exists");
        }
        User user = new User();
        user.setPassword(request.getPassword());
        user.setUsername(request.getUsername());
        userRepository.save(user);
        RegisterResponse response = new RegisterResponse();
        response.setUsername(user.getUsername());
        response.setMessage("User registered successfully");
        return response;
    }
}
