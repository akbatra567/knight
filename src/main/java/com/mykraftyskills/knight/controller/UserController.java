package com.mykraftyskills.knight.controller;

import com.mykraftyskills.knight.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/login")
    public String index(@RequestBody User user) {
        return "user routes";
    }
}
