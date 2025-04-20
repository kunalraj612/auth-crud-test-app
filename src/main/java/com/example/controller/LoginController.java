package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/test")
    public String testMethod(){
        return "Hello World";
    }

    @GetMapping("/")
    public String testMethodDirect(){
        return "Hello Direct Text";
    }

}
