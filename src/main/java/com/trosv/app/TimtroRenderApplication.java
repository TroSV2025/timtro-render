package com.trosv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class TimtroRenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimtroRenderApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Xin chào! Đây là hệ thống tìm trọ thông minh của tôi.";
    }
}
