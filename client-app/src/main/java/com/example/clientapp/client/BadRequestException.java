package com.example.clientapp.client;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BadRequestException extends RuntimeException{
    private Integer codeError;

    public BadRequestException(int codeError) {
        this.codeError = codeError;
    }

    public BadRequestException(String message, int codeError) {
        super(message);
        this.codeError = codeError;
    }

    public BadRequestException(String message, Throwable cause, int codeError) {
        super(message, cause);
        this.codeError = codeError;
    }

    public BadRequestException(Throwable cause, int codeError) {
        super(cause);
        this.codeError = codeError;
    }

    public BadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int codeError) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.codeError = codeError;
    }
}
