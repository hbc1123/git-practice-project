package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<String> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public String addUser(@RequestParam String username) {
        userService.addUser(username);
        return "User added: " + username;
    }
}