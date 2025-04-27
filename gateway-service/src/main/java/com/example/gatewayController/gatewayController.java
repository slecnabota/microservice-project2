
package com.example.gatewayController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gatewayController {

    @GetMapping("/test")
    public String testGateway() {
        return "API Gateway is working!";
    }
}
