package com.helloworld.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    
    @GetMapping("/home")    
    public String getHome() {
        return "<h1>Welcome to Spring-Github-Actions Test </h1>";
    }
}
