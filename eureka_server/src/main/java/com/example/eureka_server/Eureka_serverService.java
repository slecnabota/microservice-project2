package com.example.eureka_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Eureka_serverService {
    @Autowired
    private Eureka_serverRepository eureka_serverRepository;

    // Получить все сущности
    public List<Eureka_server> getAll() {
        return eureka_serverRepository.findAll();
    }

    // Получить сущность по ID
    public Eureka_server getById(Long id) {
        return eureka_serverRepository.findById(id).orElseThrow();
    }

    // Добавить сущность
    public Eureka_server addEntity(Eureka_server entity) {
        return eureka_serverRepository.save(entity);
    }
}
