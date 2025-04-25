package com.example.user_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user_service")
public class User_serviceController {
    @Autowired
    private User_serviceService user_serviceService;

    @GetMapping
    public List<User_service> getAll() {
        return user_serviceService.getAll();
    }

    @GetMapping("/{id}")
    public User_service getById(@PathVariable Long id) {
        return user_serviceService.getById(id);
    }

    @PostMapping
    public User_service addEntity(@RequestBody User_service entity) {
        return user_serviceService.addEntity(entity);
    }
}
