package com.cliente.ws.wsrasmooplus.service.impl;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.cliente.ws.wsrasmooplus.dto.UserDto;
import com.cliente.ws.wsrasmooplus.exception.BadRequestException;
import com.cliente.ws.wsrasmooplus.exception.NotFoundException;
import com.cliente.ws.wsrasmooplus.mapper.UserMapper;
import com.cliente.ws.wsrasmooplus.model.User;
import com.cliente.ws.wsrasmooplus.model.UserType;
import com.cliente.ws.wsrasmooplus.repository.UserRepository;
import com.cliente.ws.wsrasmooplus.repository.UserTypeRepository;
import com.cliente.ws.wsrasmooplus.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserTypeRepository userTypeRepository;

    public UserServiceImpl(UserRepository userRepository, UserTypeRepository userTypeRepository) {
        this.userRepository = userRepository;
        this.userTypeRepository = userTypeRepository;
    }

    @Override
    public User create(UserDto dto) {
        if(Objects.nonNull(dto.getId())){
            throw new BadRequestException("Id deve ser nulo!");
        }

        var userTypeOpt = userTypeRepository.findById(dto.getUserTypeId());
        if(userTypeOpt.isPresent()){
            UserType userType = userTypeOpt.get();
            User user = UserMapper.fromDtoToEntity(dto, userType, null);
            return userRepository.save(user);
        }
        throw new NotFoundException("UserTypeId não encontrado!");
    }
    
}
