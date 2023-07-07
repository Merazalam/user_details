package com.app.controller;

import com.app.entities.User;
import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
}
