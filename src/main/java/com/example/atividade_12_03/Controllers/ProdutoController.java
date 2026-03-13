package com.example.atividade_12_03.Controllers;

import com.example.atividade_12_03.Models.ProdutoModel;
import com.example.atividade_12_03.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoModel cadastrarProduto(@RequestBody ProdutoModel produto) {
        return produtoService.cadastrarProduto(produto);
    }

    @GetMapping
    public List<ProdutoModel> listarProdutos() {
        return produtoService.listarProdutos();
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizarProduto(@RequestBody ProdutoModel produto, @PathVariable Long id) {
        return produtoService.atualizarProduto(produto, id);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
    }
}
