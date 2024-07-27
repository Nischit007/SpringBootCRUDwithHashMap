package com.nisil.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {
    @GetMapping("/healthcheck")
    public String healthCheck(){
        return "ok";
    }
}
