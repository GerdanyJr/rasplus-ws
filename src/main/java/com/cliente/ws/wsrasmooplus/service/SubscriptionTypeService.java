package com.cliente.ws.wsrasmooplus.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cliente.ws.wsrasmooplus.model.SubscriptionType;

public interface SubscriptionTypeService {
    
    Page<SubscriptionType> findAll(Pageable pageable);

    SubscriptionType findById(long id);

    SubscriptionType create(SubscriptionType subscriptionType);

    SubscriptionType update(SubscriptionType subscriptionType);

    void delete(Long id);
}
