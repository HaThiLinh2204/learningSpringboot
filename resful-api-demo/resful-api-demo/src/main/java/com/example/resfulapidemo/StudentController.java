package com.example.resfulapidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @GetMapping(value = "findById")
    public String findById(int id) {
        return "Khanh";
    }
}
