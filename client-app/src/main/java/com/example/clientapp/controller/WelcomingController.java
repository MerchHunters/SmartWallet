package com.example.clientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomingController {

    @GetMapping()
    public String getWelcomingPage(){
        return "index";
    }
}
