package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
   
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        userRepository.save(user);
        return "user added Successfully";
    }
  
    @GetMapping("/getUserDetails")
    public User userName(){
        return userService.getUser(); // Return the name field of the same User object
    }
}
