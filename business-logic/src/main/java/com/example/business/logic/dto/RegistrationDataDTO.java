package com.example.business.logic.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDataDTO {

    @NotBlank(message = "название не должно быть пустым")
    private String login;
    @NotBlank(message = "название не должно быть пустым")
    private String password;
//    @NotBlank(message = "название не должно быть пустым")
//    private String repeatPassword;
}
