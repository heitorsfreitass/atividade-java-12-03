package com.example.atividade_12_03.Services;

import com.example.atividade_12_03.Models.ProdutoModel;
import com.example.atividade_12_03.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoModel cadastrarProduto(ProdutoModel produto) {
        return produtoRepository.save(produto);
    }

    public List<ProdutoModel> listarProdutos() {
        return produtoRepository.findAll();
    }

    public ProdutoModel atualizarProduto(ProdutoModel produto, Long id) {
        ProdutoModel newProduto = produtoRepository.findById(id).get();
        newProduto.setNome(produto.getNome());
        newProduto.setPreco(produto.getPreco());
        newProduto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque());

        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
