package com.example.ecommercebackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(BAD_REQUEST)
public class ConfirmationTokenAlreadyExpiredException extends RuntimeException{
    public ConfirmationTokenAlreadyExpiredException(String message) {
        super(message);
    }
}
