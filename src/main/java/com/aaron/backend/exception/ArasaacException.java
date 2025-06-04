package com.aaron.backend.exception;

import org.springframework.http.HttpStatus;

public class ArasaacException extends RuntimeException {
    private HttpStatus status;
    public ArasaacException(String message, HttpStatus status) {
        super(message);
        this.status=status;
    }
    public HttpStatus getStatus() {
        return status;
    }
}