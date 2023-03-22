package com.cliente.ws.wsrasmooplus.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cliente.ws.wsrasmooplus.dto.error.ErrorResponseDto;
import com.cliente.ws.wsrasmooplus.exception.BadRequestException;
import com.cliente.ws.wsrasmooplus.exception.NotFoundException;

@RestControllerAdvice
public class ResourceHandler {
    
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponseDto> notFoundException(NotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponseDto.builder()
        .message(e.getMessage())
        .httpStatus(HttpStatus.NOT_FOUND)
        .code(HttpStatus.NOT_FOUND.value())
        .build()); 
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponseDto> badRequestException(BadRequestException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponseDto.builder()
        .message(e.getMessage())
        .httpStatus(HttpStatus.BAD_REQUEST)
        .code(HttpStatus.BAD_REQUEST.value())
        .build());
    }
}
