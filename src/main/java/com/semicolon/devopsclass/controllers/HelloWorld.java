package com.semicolon.devopsclass.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/HELLO WORLD")
    public String sayHelloWorld(){
        return "hello world";
    }
}