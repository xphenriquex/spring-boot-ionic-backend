package com.cursospringboot.cursospringboot.services;

import java.util.Optional;

import com.cursospringboot.cursospringboot.domain.Categoria;
import com.cursospringboot.cursospringboot.repositories.CategoriaRepository;
import com.cursospringboot.cursospringboot.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(
            () -> 
                new ObjectNotFoundException(
                    "Objeto não encontrado! Id:" + id + ", Tipo: " + Categoria.class.getName()
                )
            );
    }

    public Categoria insert(Categoria obj){
        obj.setId(null);
        return repo.save(obj);
    }
}