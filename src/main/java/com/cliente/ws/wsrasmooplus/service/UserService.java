package com.cliente.ws.wsrasmooplus.service;

import com.cliente.ws.wsrasmooplus.dto.UserDto;
import com.cliente.ws.wsrasmooplus.model.User;

public interface UserService{
    
    public User create(UserDto dto);
}