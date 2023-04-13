package com.dio.desafio.desafiodeprojetojava.repository;

import com.dio.desafio.desafiodeprojetojava.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaReposity extends JpaRepository<AvaliacaoFisica, Long> {
}
