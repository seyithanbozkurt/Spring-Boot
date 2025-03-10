package com.springproject.controller;


import com.springproject.dto.User;
import com.springproject.service.UserService;
import com.springproject.service.ımpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "/api")
public class UserController {

    @Autowired
    private UserService userService ;

    @GetMapping(path="/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        return userService.getUserById(userId);
    }
}
