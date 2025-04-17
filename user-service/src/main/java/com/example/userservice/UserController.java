package com.example.userservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String getUsers() {
        return "User List from User Service";
    }
}
