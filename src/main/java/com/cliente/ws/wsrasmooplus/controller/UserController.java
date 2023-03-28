package com.cliente.ws.wsrasmooplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.ws.wsrasmooplus.dto.UserDto;
import com.cliente.ws.wsrasmooplus.model.User;
import com.cliente.ws.wsrasmooplus.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @PostMapping
    public ResponseEntity<User> create(@Valid @RequestBody UserDto userDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(userDto));
    }
}
