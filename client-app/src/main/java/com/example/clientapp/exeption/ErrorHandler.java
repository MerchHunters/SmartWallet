package com.example.clientapp.exeption;

import com.example.clientapp.client.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;

@Slf4j
public class ErrorHandler {

    public static String messageError(BadRequestException badRequestException) {
        return switch (badRequestException.getCodeError()) {
            case 1 -> {
                log.info("Код ошибки ошибки: 1. Данный логин занят");
                yield "Данный логин занят";
            }
            case 2 -> {
                log.info("Код ошибки ошибки: 2. Неверный пароль");
                yield "Неверный пароль";
            }
            case 3 -> {
                log.info("Код ошибки ошибки: 3. Пароли не совпадают");
                yield "Пароли не совпадают";
            }
            default -> {
                log.info("Неизвестная ошибка: {}", badRequestException.getCodeError());
                yield "Произошла неизвестная ошибка";
            }
        };
    }
}
