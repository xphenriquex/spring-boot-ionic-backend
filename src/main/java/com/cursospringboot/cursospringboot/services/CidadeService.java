package com.cursospringboot.cursospringboot.services;

import com.cursospringboot.cursospringboot.domain.Cidade;
import com.cursospringboot.cursospringboot.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository repo;

    public List<Cidade> findByEstado(Integer estado_id) {
        List<Cidade> listObj = repo.findCidades(estado_id);
        return listObj;
    }
}
