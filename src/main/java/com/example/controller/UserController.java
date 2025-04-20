package com.example.controller;

import com.example.dataaccess.UserEntity;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("getAllUsers")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("saveUser")
    public UserEntity saveUser(@RequestBody UserEntity user){
        return userService.saveUser(user);
    }

    @DeleteMapping("deleteUser/{user}")
    public String deleteUser(@PathVariable("user") String userId) throws Exception{
        return userService.deleteUser(userId);
    }


}
