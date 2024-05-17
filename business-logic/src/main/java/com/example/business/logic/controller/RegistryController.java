package com.example.business.logic.controller;


import com.example.business.logic.dto.RegistrationDataDTO;
import com.example.business.logic.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("main/registry")
@Slf4j

public class RegistryController {

    private final UserService userService;

    public RegistryController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Long postUserByDTO(@Valid @RequestBody RegistrationDataDTO dto,
                              UriComponentsBuilder uriComponentsBuilder) {

        return userService.CreateByLoginAndPassword(
                dto.getLogin(), dto.getPassword()
        );
    }
}
