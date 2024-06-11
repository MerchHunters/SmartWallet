package com.example.clientapp.security.controller;


import com.example.clientapp.security.model.MyUser;
import com.example.clientapp.security.service.MyUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController
@RequestMapping("registration")
@RequiredArgsConstructor
public class RegistrationRestController {

    private final MyUserService myUserService;
    private final PasswordEncoder passwordEncoder;
    @PostMapping()
    public void crateUser(@RequestBody MyUser myUser){
        myUser.setPassword(passwordEncoder.encode(myUser.getPassword()));
        myUserService.save(myUser);
    }
}
*/
