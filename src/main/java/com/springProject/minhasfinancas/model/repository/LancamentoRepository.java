package com.springProject.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springProject.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
