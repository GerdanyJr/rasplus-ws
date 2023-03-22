package com.cliente.ws.wsrasmooplus.service.impl;

import java.util.Objects;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cliente.ws.wsrasmooplus.dto.SubscriptionTypeDto;
import com.cliente.ws.wsrasmooplus.exception.BadRequestException;
import com.cliente.ws.wsrasmooplus.exception.NotFoundException;
import com.cliente.ws.wsrasmooplus.mapper.SubscriptionTypeMapper;
import com.cliente.ws.wsrasmooplus.model.SubscriptionType;
import com.cliente.ws.wsrasmooplus.repository.SubscriptionTypeRepository;
import com.cliente.ws.wsrasmooplus.service.SubscriptionTypeService;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    private final SubscriptionTypeRepository subscriptionTypeRepository;

    SubscriptionTypeServiceImpl(SubscriptionTypeRepository subscriptionTypeRepository) {
        this.subscriptionTypeRepository = subscriptionTypeRepository;
    }

    @Override
    public Page<SubscriptionType> findAll(Pageable pageable) {
        return subscriptionTypeRepository.findAll(pageable);
    }

    @Override
    public SubscriptionType findById(long id) {
        return getSubscriptiontype(id);
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDto dto) {
        if (Objects.nonNull(dto.getId())) {
            throw new BadRequestException("Id deve ser nulo!");
        }
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public SubscriptionType update(Long id,SubscriptionTypeDto dto) {
        getSubscriptiontype(id);
        if(Objects.nonNull(dto.getId())){
            throw new BadRequestException("Id deve ser nulo");
        }
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public void delete(Long id) {
        getSubscriptiontype(id);
        subscriptionTypeRepository.deleteById(id);
    }

    private SubscriptionType getSubscriptiontype(Long id){
        Optional<SubscriptionType> subscriptionType = subscriptionTypeRepository.findById(id);
        if (subscriptionType.isPresent()) {
            return subscriptionType.get();
        }
        throw new NotFoundException("SubscriptionType não encontrado!");
    }
}
