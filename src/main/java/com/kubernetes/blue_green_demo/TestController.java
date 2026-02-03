package com.kubernetes.blue_green_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String hello() {

        // Read Env Vars (Simulating different versions)
        String version = System.getenv().getOrDefault("APP_VERSION", "v1");
        String color = System.getenv().getOrDefault("APP_COLOR", "blue");

        return String.format(
                "<div style='text-align:center; padding: 50px;'>" +
                        "<h1>Spring Boot App</h1>" +
                        "<h2>Version: %s</h2>" +
                        "<h2 style='color:%s; font-size:50px;'>%s</h2>" +
                        "</div>",
                version, color, color.toUpperCase()
        );
    }
}
