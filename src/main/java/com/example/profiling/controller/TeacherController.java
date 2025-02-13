package com.example.profiling.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("teacher")
@RestController
public class TeacherController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello from teacher";
    }
}
