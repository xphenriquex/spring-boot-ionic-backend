package com.cursospringboot.cursospringboot.repositories;

import com.cursospringboot.cursospringboot.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}