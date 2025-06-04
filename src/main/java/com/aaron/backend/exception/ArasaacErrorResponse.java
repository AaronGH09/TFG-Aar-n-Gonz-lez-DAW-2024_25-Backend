package com.aaron.backend.exception;

public class ArasaacErrorResponse {
    private int status;
    private String message;

    public ArasaacErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() { return status; }
    public String getMessage() { return message; }
    public void setStatus(int status) { this.status = status; }
    public void setMessage(String message) { this.message = message; }
}