package com.cliente.ws.wsrasmooplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.ws.wsrasmooplus.model.UserType;
import com.cliente.ws.wsrasmooplus.repository.UserTypeRepository;

@RequestMapping("/user-type")
@RestController
public class UserTypeController {
    
    @Autowired
    private UserTypeRepository userTypeRepository;

    @GetMapping
    public ResponseEntity<Page<UserType>> findAll(@RequestParam Integer actualPage){
        Pageable pageable = PageRequest.of(actualPage, 3);
        return ResponseEntity.status(HttpStatus.OK).body(userTypeRepository.findAll(pageable));
    }
}
