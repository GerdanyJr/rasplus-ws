package com.cliente.ws.wsrasmooplus.service.impl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cliente.ws.wsrasmooplus.exception.NotFoundException;
import com.cliente.ws.wsrasmooplus.model.SubscriptionType;
import com.cliente.ws.wsrasmooplus.repository.SubscriptionTypeRepository;
import com.cliente.ws.wsrasmooplus.service.SubscriptionTypeService;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    private SubscriptionTypeRepository subscriptionTypeRepository;

    SubscriptionTypeServiceImpl(SubscriptionTypeRepository subscriptionTypeRepository){
        this.subscriptionTypeRepository = subscriptionTypeRepository;
    }

    @Override
    public Page<SubscriptionType> findAll(Pageable pageable) {
        return subscriptionTypeRepository.findAll(pageable);
    }

    @Override
    public SubscriptionType findById(long id) {
        Optional<SubscriptionType> subscriptionType = subscriptionTypeRepository.findById(id);
        if (subscriptionType.isPresent()){
            return subscriptionType.get();
        }
        throw new NotFoundException("SubscriptionType não encontrado!");
    }

    @Override
    public SubscriptionType create(SubscriptionType subscriptionType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public SubscriptionType update(SubscriptionType subscriptionType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
