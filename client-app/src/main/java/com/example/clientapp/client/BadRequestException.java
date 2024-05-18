package com.example.clientapp.client;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BadRequestException extends RuntimeException{
   private Integer error;

    public BadRequestException(Integer error) {
        this.error = error;
    }

    public BadRequestException(String message, Integer error) {
        super(message);
        this.error = error;
    }

    public BadRequestException(String message, Throwable cause, Integer error) {
        super(message, cause);
        this.error = error;
    }

    public BadRequestException(Throwable cause, Integer error) {
        super(cause);
        this.error = error;
    }

    public BadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer error) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.error = error;
    }
}
