package com.example.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order_service")
public class Order_serviceController {
    @Autowired
    private Order_serviceService order_serviceService;

    @GetMapping
    public List<Order_service> getAll() {
        return order_serviceService.getAll();
    }

    @GetMapping("/{id}")
    public Order_service getById(@PathVariable Long id) {
        return order_serviceService.getById(id);
    }

    @PostMapping
    public Order_service addEntity(@RequestBody Order_service entity) {
        return order_serviceService.addEntity(entity);
    }
}
