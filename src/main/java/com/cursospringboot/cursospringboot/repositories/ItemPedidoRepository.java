package com.cursospringboot.cursospringboot.repositories;

import com.cursospringboot.cursospringboot.domain.ItemPedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
    
}