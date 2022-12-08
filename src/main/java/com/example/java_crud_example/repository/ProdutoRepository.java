package com.example.java_crud_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java_crud_example.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
