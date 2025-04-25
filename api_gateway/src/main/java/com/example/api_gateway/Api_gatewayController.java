package com.example.api_gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api_gateway")
public class Api_gatewayController {
    @Autowired
    private Api_gatewayService api_gatewayService;

    @GetMapping
    public List<Api_gateway> getAll() {
        return api_gatewayService.getAll();
    }

    @GetMapping("/{id}")
    public Api_gateway getById(@PathVariable Long id) {
        return api_gatewayService.getById(id);
    }

    @PostMapping
    public Api_gateway addEntity(@RequestBody Api_gateway entity) {
        return api_gatewayService.addEntity(entity);
    }
}
