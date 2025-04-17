package com.example.apigateway;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiGatewayController {
    @GetMapping("/")
    public String home() {
        return "API Gateway is running";
    }
}
