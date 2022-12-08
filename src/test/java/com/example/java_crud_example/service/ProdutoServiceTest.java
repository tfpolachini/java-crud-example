package com.example.java_crud_example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.java_crud_example.entity.Produto;
import com.example.java_crud_example.repository.ProdutoRepository;

@ExtendWith(MockitoExtension.class)
public class ProdutoServiceTest {

    @Mock
    private ProdutoRepository produtoRepository;

    @InjectMocks
    private ProdutoService produtoService;

    @Test
    void deveListarTodosOsProdutos() {

        // GIVEN
        var produtosEsperados = criarListaDeProdutos();
        when(produtoRepository.findAll()).thenReturn(produtosEsperados);

        // WHEN
        var produtos = produtoService.listar();


        // THEN
        assertEquals(produtosEsperados, produtos);
    }

    private List<Produto> criarListaDeProdutos() {
        
        var produto = new Produto();

        produto.setId(1);
        produto.setNome("Produto de teste");
        produto.setPreco(new BigDecimal("10.00"));

        return List.of(produto);
    }
}
