package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSource {
    @GetMapping
    public String home(){
        return ("<h1>Hello</h1>");
    }
}
