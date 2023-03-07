package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private User user;

    public void addUser(User user){
        this.user=user;
    }

    public User getUser(){
        return user;
    }
}
