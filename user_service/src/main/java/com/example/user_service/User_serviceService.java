package com.example.user_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_serviceService {
    @Autowired
    private User_serviceRepository user_serviceRepository;

    // Получить все сущности
    public List<User_service> getAll() {
        return user_serviceRepository.findAll();
    }

    // Получить сущность по ID
    public User_service getById(Long id) {
        return user_serviceRepository.findById(id).orElseThrow();
    }

    // Добавить сущность
    public User_service addEntity(User_service entity) {
        return user_serviceRepository.save(entity);
    }
}
