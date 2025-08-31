package com.klimov.__SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet () {
        //System.out.println("I'm here");
        return "Welcome Home";
    }
    @RequestMapping("/about")
    public String about(){
        return "What do you think About !?)";
    }
}
