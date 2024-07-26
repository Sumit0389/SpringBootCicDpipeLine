package com.example.SpringBootCicDpipeLine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/welcome")
    public String getMessage()
    {
        return "Welcome to CICD process";
    }



}
