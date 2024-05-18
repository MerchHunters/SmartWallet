package com.example.clientapp.controller.authorization;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthorizationController {


    @GetMapping()
    public String getAuthorizationPage(){
        return "authorization/base_login";
    }

}
