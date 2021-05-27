package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MS2Controller {

    @GetMapping("ms2")
    public String methodFromMS2(){
        return "returning data from Microservice 2";
    }
}
