package com.example.eureka_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eureka_server")
public class Eureka_serverController {
    @Autowired
    private Eureka_serverService eureka_serverService;

    @GetMapping
    public List<Eureka_server> getAll() {
        return eureka_serverService.getAll();
    }

    @GetMapping("/{id}")
    public Eureka_server getById(@PathVariable Long id) {
        return eureka_serverService.getById(id);
    }

    @PostMapping
    public Eureka_server addEntity(@RequestBody Eureka_server entity) {
        return eureka_serverService.addEntity(entity);
    }
}
