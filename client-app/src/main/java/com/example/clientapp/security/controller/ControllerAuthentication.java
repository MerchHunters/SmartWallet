package com.example.clientapp.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ControllerAuthentication {


    @GetMapping("login")
    public String getPageAuthentication(@RequestParam(value = "error", required = false) String error, Model model){
        if (error != null) {
            model.addAttribute("errorMessage", "Неправильный логин или пароль");
        }
        model.addAttribute("error", error != null);
        return "custom_login";
    }
}
