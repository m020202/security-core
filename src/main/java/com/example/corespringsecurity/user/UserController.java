package com.example.corespringsecurity.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/mypage")
    public String user() {
        return "mypage";
    }
}
