package com.example.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_serviceService {
    @Autowired
    private Order_serviceRepository order_serviceRepository;

    // Получить все сущности
    public List<Order_service> getAll() {
        return order_serviceRepository.findAll();
    }

    // Получить сущность по ID
    public Order_service getById(Long id) {
        return order_serviceRepository.findById(id).orElseThrow();
    }

    // Добавить сущность
    public Order_service addEntity(Order_service entity) {
        return order_serviceRepository.save(entity);
    }
}
