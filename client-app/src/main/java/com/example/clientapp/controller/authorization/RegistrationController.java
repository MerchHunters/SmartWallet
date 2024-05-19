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
        return "main/authorization/registration/registration_page";
    }


    @PostMapping()
    public String registration(RegistrationDataDTO dataDTO, Model model){
        ResponseDTO answer = authorizationservice.sendDataRegistration(dataDTO);
        if(answer.getStatus() == 200){
            log.info("{}", answer);
            log.info("Всё прошло успешно");
            model.addAttribute("user_id", answer.getAnswer());
            return "main/main_page";
        } else {
            model.addAttribute("error", "Пользователь с такми логином уже существует");
            return "redirect:/main/registration";
        }
    }

}
