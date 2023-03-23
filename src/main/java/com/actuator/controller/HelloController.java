package com.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/welcome")
    public String welcome() {
        return "Hello-Controller";
    }

}
