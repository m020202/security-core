package com.example.corespringsecurity.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
    @GetMapping("/messages")
    public String messages() {
        return "messages";
    }
}
