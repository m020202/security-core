package com.example.corespringsecurity.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/messages")
    public String messages() {
        return "messages";
    }
}
