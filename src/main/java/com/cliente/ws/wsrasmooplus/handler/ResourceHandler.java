package com.cliente.ws.wsrasmooplus.handler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponseDto> methodArgumentNotValidException(MethodArgumentNotValidException e){
        Map<String,String> messages = new HashMap<>();
        e.getBindingResult().getAllErrors().forEach(error ->{
            String field = ((FieldError) error).getField();
            String defaultMessage = error.getDefaultMessage();
            messages.put(field,defaultMessage);
        });
        ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
        .message(Arrays.toString(messages.entrySet().toArray()))
        .httpStatus(HttpStatus.BAD_REQUEST)
        .code(HttpStatus.BAD_REQUEST.value())
        .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponseDto);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorResponseDto> dataIntegrityViolationException(DataIntegrityViolationException d){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponseDto.builder().
        message(d.getMessage())
        .httpStatus(HttpStatus.BAD_REQUEST)
        .code(HttpStatus.BAD_REQUEST.value())
        .build());
    }
}
