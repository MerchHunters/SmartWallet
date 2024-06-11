package com.example.clientapp.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main/true_autorisaishen")
public class ControllerAuthentication {


    @GetMapping()
    public String getPageAuthentication(){
        return "main/true_autorisaishen";
    }
}
