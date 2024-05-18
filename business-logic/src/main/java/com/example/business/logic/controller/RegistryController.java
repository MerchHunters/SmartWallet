package com.example.business.logic.controller;


import com.example.business.logic.dto.RegistrationDataDTO;
import com.example.business.logic.dto.ResponseDTO;
import com.example.business.logic.exception.PasswordNotCorrectException;
import com.example.business.logic.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("main/registration")
@Slf4j
public class RegistryController {

    private final UserService userService;

    @Autowired
    public RegistryController(UserService userService) {
        this.userService = userService;
    }




    @PostMapping
    public ResponseEntity<?> postUserByDTO(@Valid @RequestBody RegistrationDataDTO dto,
                                           UriComponentsBuilder uriComponentsBuilder) {

        try {
            return ResponseEntity.ok().body(userService.CreateByLoginAndPassword(
                    dto.getLogin(), dto.getPassword(), dto.getRepeatPassword()
            ));
        } catch (PasswordNotCorrectException e) {
            log.info("return not correct password!");
            ResponseDTO dataDTO = new ResponseDTO(400, 1);
            return ResponseEntity.badRequest().body(dataDTO);
        }

    }
}

