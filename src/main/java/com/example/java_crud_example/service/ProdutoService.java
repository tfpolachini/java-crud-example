package com.example.java_crud_example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java_crud_example.entity.Produto;
import com.example.java_crud_example.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listar() {
        
        return produtoRepository.findAll();
    }
}
