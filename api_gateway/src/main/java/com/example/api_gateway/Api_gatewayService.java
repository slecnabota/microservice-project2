package com.example.api_gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Api_gatewayService {
    @Autowired
    private Api_gatewayRepository api_gatewayRepository;

    // Получить все сущности
    public List<Api_gateway> getAll() {
        return api_gatewayRepository.findAll();
    }

    // Получить сущность по ID
    public Api_gateway getById(Long id) {
        return api_gatewayRepository.findById(id).orElseThrow();
    }

    // Добавить сущность
    public Api_gateway addEntity(Api_gateway entity) {
        return api_gatewayRepository.save(entity);
    }
}
