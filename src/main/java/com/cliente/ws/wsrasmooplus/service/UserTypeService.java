package com.cliente.ws.wsrasmooplus.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cliente.ws.wsrasmooplus.dto.UserTypeDto;
import com.cliente.ws.wsrasmooplus.model.UserType;

public interface UserTypeService {
    UserType create(UserTypeDto dto);

    Page<UserType> findAll(Pageable pageable);

    UserType findById(Long id);

    UserType update(Long id, UserTypeDto dto);

    void delete(long id); 
}
