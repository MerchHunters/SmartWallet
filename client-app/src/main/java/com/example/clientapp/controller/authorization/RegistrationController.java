package com.example.clientapp.controller.authorization;

import com.example.clientapp.client.AuthorizationClientService;
import com.example.clientapp.dto.RegistrationDataDTO;
import com.example.clientapp.dto.ResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main/registration")
@RequiredArgsConstructor
@Slf4j
public class RegistrationController
{

    private final AuthorizationClientService authorizationservice;


    @GetMapping()
    public String getRegistrationPage(){
        return "main/authorization/registration_page";
    }


    @PostMapping()
    public String registration(RegistrationDataDTO dataDTO, Model model){
        RegistrationDataDTO dto = new RegistrationDataDTO();
        dto.setLogin("newUser");
        dto.setPassword("123");

      ResponseDTO answer = authorizationservice.sendDataRegistration(dto);
        log.info("{}", answer);
        log.info("Всё прошло успешно");
        return "Ok";
    }

}
