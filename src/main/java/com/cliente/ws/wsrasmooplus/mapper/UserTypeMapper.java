package com.cliente.ws.wsrasmooplus.mapper;

import com.cliente.ws.wsrasmooplus.dto.UserTypeDto;
import com.cliente.ws.wsrasmooplus.model.UserType;

public class UserTypeMapper {
    
    public static UserType fromDtoToEntity(UserTypeDto dto){
        return UserType.builder()
        .id(dto.getId())
        .name(dto.getName())
        .description(dto.getDescription())
        .build();
    }
}
