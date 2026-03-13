package com.example.atividade_12_03.Repositories;

import com.example.atividade_12_03.Models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
