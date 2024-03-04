package com.practice.sadeep.Controller;

import com.practice.sadeep.Model.User;
import com.practice.sadeep.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){

        return userRepository.save(newUser);
    }

    @GetMapping("/user")
    List<User> getUsers(){
        return userRepository.findAll();
    }

}
