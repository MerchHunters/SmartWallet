package com.example.business.logic.controller;


import com.example.business.logic.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main/registry")
@Slf4j

public class RegistryController {

    private final UserService userService;

    public RegistryController(UserService userService) {
        this.userService = userService;
    }

//    public Long postUserByDTO(@Valid @ResponseBody ) {
//
//    }
}
