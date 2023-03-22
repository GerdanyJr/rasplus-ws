package com.cliente.ws.wsrasmooplus.dto.error;

import org.springframework.http.HttpStatus;

import lombok.Builder;

@Builder
public class ErrorResponseDto {
    
    private String message;
    private HttpStatus httpStatus;
    private Integer code;

    public ErrorResponseDto(String message, HttpStatus httpStatus, Integer code) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }   
}