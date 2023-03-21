package com.cliente.ws.wsrasmooplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.ws.wsrasmooplus.dto.SubscriptionTypeDto;
import com.cliente.ws.wsrasmooplus.model.SubscriptionType;
import com.cliente.ws.wsrasmooplus.service.SubscriptionTypeService;

@RestController
@RequestMapping("/subscription-Type")
public class SusbcriptionTypeController {
    
    @Autowired
    private SubscriptionTypeService subscriptionTypeService;

    @GetMapping("/")
    public ResponseEntity<Page<SubscriptionType>> findAll(@RequestParam Integer actualPage){
        Pageable pageable = PageRequest.of(actualPage, 3);
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findAll(@PathVariable Long id){
            return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<SubscriptionType> create(@RequestBody SubscriptionTypeDto subscriptionTypeDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(subscriptionTypeService.create(subscriptionTypeDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubscriptionType> update(@PathVariable("id") Long id,@RequestBody SubscriptionTypeDto subscriptionTypeDto){
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.update(id,subscriptionTypeDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id")Long id){
        subscriptionTypeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
