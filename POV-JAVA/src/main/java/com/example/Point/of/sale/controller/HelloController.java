package com.example.Point.of.sale.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String hello(){
        return "popopopo 1dsdsddsdss11d:)";
    }

    @GetMapping("/user")
    public String getUsers(){
        return "Users";
    }


    @GetMapping("/presentation")
    public String getPresentation(){
        return "presentation";
    }
}
