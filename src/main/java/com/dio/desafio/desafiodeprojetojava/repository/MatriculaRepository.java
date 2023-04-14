package com.dio.desafio.desafiodeprojetojava.repository;

import com.dio.desafio.desafiodeprojetojava.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
