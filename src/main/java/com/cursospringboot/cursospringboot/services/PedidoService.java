package com.cursospringboot.cursospringboot.services;

import java.util.Optional;

import com.cursospringboot.cursospringboot.domain.Pedido;
import com.cursospringboot.cursospringboot.repositories.PedidoRepository;
import com.cursospringboot.cursospringboot.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(
            () -> 
                new ObjectNotFoundException(
                    "Objeto não encontrado! Id:" + id + ", Tipo: " + Pedido.class.getName()
                )
            );
    }
}