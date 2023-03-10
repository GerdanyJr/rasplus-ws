package com.cliente.ws.wsrasmooplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cliente.ws.wsrasmooplus.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
}
