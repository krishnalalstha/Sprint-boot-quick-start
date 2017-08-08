package com.sprintboot.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by krishna on 8/8/17.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "This is my first Spring Boot Application";
    }
}
