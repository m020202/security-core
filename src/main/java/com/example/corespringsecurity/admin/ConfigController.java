package com.example.corespringsecurity.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @GetMapping("/config")
    public String config() {
        return "config";
    }
}
