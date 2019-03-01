package com.redhat.training.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApiController {

    @GetMapping("/public/hello/{name}")
    public String publicHello(@PathVariable String name){
        return "Hello, "+name;
    }

    @GetMapping("/protected/hello/{name}")
    protected String protectedHello(@PathVariable String name){
        return "Hello, "+name;
    }
}
