package com.cursospringboot.cursospringboot.services;

import java.util.Optional;

import com.cursospringboot.cursospringboot.domain.Cliente;
import com.cursospringboot.cursospringboot.repositories.ClienteRepository;
import com.cursospringboot.cursospringboot.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(
            () -> 
                new ObjectNotFoundException(
                    "Objeto não encontrado! Id:" + id + ", Tipo: " + Cliente.class.getName()
                )
            );
    }
}