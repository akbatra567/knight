package com.mykraftyskills.knight.controller;

import com.mykraftyskills.knight.model.User;
import com.mykraftyskills.knight.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String index(@RequestBody User user) {
        return "user routes";
    }
}
