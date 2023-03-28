package com.cliente.ws.wsrasmooplus.mapper;

import com.cliente.ws.wsrasmooplus.dto.UserDto;
import com.cliente.ws.wsrasmooplus.model.SubscriptionType;
import com.cliente.ws.wsrasmooplus.model.User;
import com.cliente.ws.wsrasmooplus.model.UserType;

public class UserMapper {
    
    public static User fromDtoToEntity(UserDto dto,UserType userType,SubscriptionType subscriptionType){
        return User.builder()
        .id(dto.getId())
        .name(dto.getName())
        .cpf(dto.getCpf())
        .phone(dto.getPhone())
        .email(dto.getPhone())
        .dtExpiration(dto.getDtExpiration())
        .dtSubscription(dto.getDtSubscription())
        .userType(userType)
        .subscriptionType(subscriptionType)
        .build();
        
    }
}
