package com.actuator.springbootactuator.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actuator.springbootactuator.helper.Student;

@RestController
public class HomeContoller {
    @Autowired
    private Student student;

    @GetMapping("/data")
    public Map<String, String> getData() {
      
        return Map.of("name", "Rajesh", "age", "30");
    }
}
