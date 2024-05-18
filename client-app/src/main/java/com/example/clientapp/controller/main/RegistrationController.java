package com.example.clientapp.controller.main;


import com.example.clientapp.client.AuthorizationDataClient;
import com.example.clientapp.client.BadRequestException;
import com.example.clientapp.dto.RegistrationDataDTO;
import com.example.clientapp.exeption.ErrorHandler;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;

@Controller
@RequestMapping("main/registration")
@Slf4j
@RequiredArgsConstructor
public class RegistrationController {


    private final AuthorizationDataClient authorizationDataClient;

//    @GetMapping()
//    public String getRegistrationPage() {
//        return "main/registration_page";
//    }

    @PostMapping()
    public String sendRegistrationData(RegistrationDataDTO dto, Model model) {
        log.info(dto.toString());
        try {
            RegistrationDataDTO registrationDataDTO = new RegistrationDataDTO();
            registrationDataDTO.setLogin("user");
            registrationDataDTO.setPassword("123");
            Long user_id = authorizationDataClient.sendDataRegistration(registrationDataDTO);
            log.info("Получили id юзера: {}", user_id);
            log.info("всё прошло успешно");
//            model.addAttribute("user_id", user_id);
//            return "main/wallet";
            return null;
        } catch (BadRequestException badRequestException) {
            log.info("Что-то пошло не так при регистрации аккаунта");
           String error =  ErrorHandler.messageError(badRequestException);
            model.addAttribute("error", error);
            return "redirect:/main/registration";
        }
    }
}
