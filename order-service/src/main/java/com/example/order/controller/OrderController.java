package com.example.order.controller;

import com.example.order.model.Order;
import com.example.order.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository repo;
    public OrderController(OrderRepository repo) { this.repo = repo; }
    @GetMapping 
    public List<Order> getAll() { 
        return repo.findAll(); 
    }
    @PostMapping 
    public Order create(@RequestBody Order order) { 
        return repo.save(order); 
    }
    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Order not found: " + id));
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
    @PutMapping("/{id}")
    public Order update(@PathVariable Long id, @RequestBody Order updated) {
        Order order = repo.findById(id).orElseThrow(() -> new RuntimeException("Order not found: " + id));
        order.setDescription(updated.getDescription());
        order.setCreatedAt(updated.getCreatedAt());
        return repo.save(order);
    }
}
