package com.example.clientapp.controller.registration;


import com.example.clientapp.client.AuthorizationDataClient;
import com.example.clientapp.client.BadRequestException;
import com.example.clientapp.dto.AuthenticationDTO;
import com.example.clientapp.dto.RegistrationDataDTO;
import com.example.clientapp.exeption.ErrorHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("main/authorization")
public class AuthorizationController {


    private final AuthorizationDataClient authorizationDataClient;

    @Autowired
    public AuthorizationController(AuthorizationDataClient authorizationDataClient) {
        this.authorizationDataClient = authorizationDataClient;
    }

    @GetMapping()
    public String getAuthorizationPage(){
        return "main/authorization_page";
    }

    @PostMapping()
    public String sendAuthorizationData(AuthenticationDTO dto, Model model){
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
            return "redirect:/main/authorization_page";
        }
    }
}
