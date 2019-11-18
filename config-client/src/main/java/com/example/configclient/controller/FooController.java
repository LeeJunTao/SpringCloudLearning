package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @Value("${word}")
    private String from;

    @RequestMapping("/hi")
    public String hi(){
        return from;
    }
}
