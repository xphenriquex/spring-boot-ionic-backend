package com.cursospringboot.cursospringboot.repositories;

import com.cursospringboot.cursospringboot.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
}