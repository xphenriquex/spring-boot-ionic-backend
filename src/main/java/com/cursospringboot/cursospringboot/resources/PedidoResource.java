package com.cursospringboot.cursospringboot.resources;

import com.cursospringboot.cursospringboot.domain.Categoria;
import com.cursospringboot.cursospringboot.domain.Pedido;
import com.cursospringboot.cursospringboot.dto.CategoriaDTO;
import com.cursospringboot.cursospringboot.services.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService service;

    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    public ResponseEntity<Pedido> find(@PathVariable Integer id)
    {
        Pedido obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody Pedido obj)
    {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }
}