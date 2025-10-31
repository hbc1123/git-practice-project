package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<String> users = new ArrayList<>();

    public UserService() {
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
    }

    public List<String> getAllUsers() {
        return new ArrayList<>(users);
    }

    public void addUser(String username) {
        users.add(username);
    }
}