package com.cursospringboot.cursospringboot.resources;

import com.cursospringboot.cursospringboot.domain.Cidade;
import com.cursospringboot.cursospringboot.domain.Estado;
import com.cursospringboot.cursospringboot.dto.CidadeDTO;
import com.cursospringboot.cursospringboot.dto.EstadoDTO;
import com.cursospringboot.cursospringboot.services.CidadeService;
import com.cursospringboot.cursospringboot.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {

    @Autowired
    private EstadoService service;

    @Autowired
    private CidadeService cidadeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<EstadoDTO>> findAll()
    {
        List<Estado> list = service.findAll();
        List<EstadoDTO> listDto =
                list
                        .stream()
                        .map(obj -> new EstadoDTO(obj))
                        .collect(Collectors.toList());

        return ResponseEntity.ok().body(listDto);
    }


    @RequestMapping(value = "/{estadoId}/cidades", method = RequestMethod.GET)
    public ResponseEntity<List<CidadeDTO>> findCidades(@PathVariable Integer estadoId)
    {
        List<Cidade> list = cidadeService.findByEstado(estadoId);
        List<CidadeDTO> listDto =
                list
                        .stream()
                        .map(obj -> new CidadeDTO(obj))
                        .collect(Collectors.toList());

        return ResponseEntity.ok().body(listDto);
    }
}
