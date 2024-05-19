package com.example.clientapp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class ResponseDTO {


    private Integer status;

    private Long answer;

}