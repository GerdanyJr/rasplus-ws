package com.cliente.ws.wsrasmooplus.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cliente.ws.wsrasmooplus.dto.UserTypeDto;
import com.cliente.ws.wsrasmooplus.model.UserType;
import com.cliente.ws.wsrasmooplus.repository.UserTypeRepository;
import com.cliente.ws.wsrasmooplus.service.UserTypeService;

public class UserTypeServiceImpl implements UserTypeService {

    private UserTypeRepository userTypeRepository;

    public UserTypeServiceImpl(UserTypeRepository userTypeRepository){
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public UserType create(UserTypeDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Page<UserType> findAll(Pageable pageable) {
        return userTypeRepository.findAll(pageable);
    }

    @Override
    public UserType findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public UserType update(Long id, UserTypeDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
