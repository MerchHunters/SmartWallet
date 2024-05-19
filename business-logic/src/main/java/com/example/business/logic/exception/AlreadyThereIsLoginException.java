package com.example.business.logic.exception;

public class AlreadyThereIsLoginException extends RuntimeException{

    public AlreadyThereIsLoginException(String message) {
        super(message);
    }
}
