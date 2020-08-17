package com.cursospringboot.cursospringboot.repositories;

import com.cursospringboot.cursospringboot.domain.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
    
}