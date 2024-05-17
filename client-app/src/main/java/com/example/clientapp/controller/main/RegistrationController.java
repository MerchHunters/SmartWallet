package com.example.clientapp.controller.main;


import com.example.clientapp.client.AuthorizationDataClient;
import com.example.clientapp.client.BadRequestException;
import com.example.clientapp.dto.RegistrationDataDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main/registration")
@Slf4j
@AllArgsConstructor
public class RegistrationController {


    private final AuthorizationDataClient authorizationDataClient;

    @GetMapping()
    public String getRegistrationPage() {
        return "main/registration_page";
    }

    @PostMapping()
    public String sendData(RegistrationDataDTO dto, Model model) {
        try {
            Long user_id = authorizationDataClient.sendDataRegistration(dto);
            log.info("Получили id юзера: {}", user_id);
            model.addAttribute("user_id", user_id);
            return "main/wallet";
        } catch (BadRequestException exception) {
            log.info("Что-то пошло не так при регистрации аккаунта");
            model.addAttribute("errors", exception.getErrors());
            return "redirect:/main/registration";
        }
    }


}
