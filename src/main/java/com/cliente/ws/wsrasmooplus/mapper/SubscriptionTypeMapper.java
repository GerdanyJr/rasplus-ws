package com.cliente.ws.wsrasmooplus.mapper;

import com.cliente.ws.wsrasmooplus.dto.SubscriptionTypeDto;
import com.cliente.ws.wsrasmooplus.model.SubscriptionType;

public class SubscriptionTypeMapper {
    
    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto){
        return SubscriptionType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .accessMonth(dto.getAcessMonth())
                .price(dto.getPrice())
                .productKey(dto.getProductKey())
                .build();
    }
}
