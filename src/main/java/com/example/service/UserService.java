package com.example.service;

import com.example.dataaccess.UserEntity;
import com.example.dataaccess.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity saveUser(UserEntity user){

        return userRepository.save(user);

    }

    public String deleteUser(String userId) throws Exception{

        System.out.println("----------isExist----------- : "+userRepository.existsById(userId));

        if(userRepository.existsById(userId)){
            userRepository.deleteById(userId);
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "user not found with the given id : " + userId
            );
        }
        return "DELETE SUCCESS";
    }

}
