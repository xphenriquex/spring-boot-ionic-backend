package com.cursospringboot.cursospringboot.repositories;

import com.cursospringboot.cursospringboot.domain.Categoria;
import com.cursospringboot.cursospringboot.domain.Produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    @Transactional(readOnly = true)
    //@Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat where obj.nome like %:nome% AND cat IN :categorias")
    public Page<Produto> findDistinctByNomeContainingAndCategoriasIn(@Param("nome") String nome, @Param("categorias")List<Categoria> categorias, Pageable pageRequest);
}