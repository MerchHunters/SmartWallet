package com.example.business.logic.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {

    @NotBlank(message = "название не должно быть пустым")
    private Integer status;
    @NotBlank(message = "название не должно быть пустым")
    private Integer typeException;

}