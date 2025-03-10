package com.springproject.controller;

import com.springproject.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    /*
    @GetMapping(path="/message/{m}")
    public String getMymessage(@PathVariable("m") String message){
        return "Your message is :" + message;
    }
     */

    /*
    @GetMapping(path="/message")
    public String getMymessage(@RequestParam("m") String message){
        return "Your message is : " + message;
    }
    */

    /*
    @GetMapping({"/message1","/message1/{message}"})
    public String getMymessageWithVariable(@PathVariable(name = "message", required = false) String message){
        return "Your message is :"  + message;
    }

    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message", required = false,defaultValue = "my default message") String message){
        return "Your message is:" + message;
    }
     */

    /*
    @PostMapping("users")
    public User saveuser(@RequestBody User user){
        System.out.println("User saved");
        user.setPassword("");
        return user;
    }

    @PostMapping("users-all")
    public List<User> saveuser(@RequestBody List<User> users){
        System.out.println("User saved");
        users.forEach(user -> user.setPassword(""));
        return users;
    }
     */

    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){
        return "Your header is:" + myHeader;
    }
}
