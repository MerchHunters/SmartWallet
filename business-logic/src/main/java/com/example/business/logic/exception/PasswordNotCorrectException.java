package com.example.business.logic.exception;

public class PasswordNotCorrectException extends RuntimeException {

    public PasswordNotCorrectException(String message) {
        super(message);
    }
}
