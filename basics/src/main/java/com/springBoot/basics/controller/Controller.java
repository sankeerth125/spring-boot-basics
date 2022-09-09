package com.springBoot.basics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Controller {

    @GetMapping("/getMessage")
    public String getMessage() {
        return "Hello Bobby!!!";
    }
}
