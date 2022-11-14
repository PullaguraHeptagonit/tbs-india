package com.heptagon.tbsindia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tbs/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TBSIndiaController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to " + appName + " Application";
    }

}
