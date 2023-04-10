package com.dio.desafio.desafiodeprojetojava.repository;

import com.dio.desafio.desafiodeprojetojava.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRespository extends JpaRepository<Aluno, Long> {
}
