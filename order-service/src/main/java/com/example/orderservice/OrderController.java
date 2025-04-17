package com.example.orderservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping
    public String getOrders() {
        return "Orders from Order Service";
    }
}
