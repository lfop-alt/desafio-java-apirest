package com.dio.desafio.desafiodeprojetojava.repository;

import com.dio.desafio.desafiodeprojetojava.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRespository extends JpaRepository<Aluno, Long> {

    //filtrar um relatorio em especifico
    // informação do model ALuno
    // neste caso estou retonando a data de aniversario do aluno

    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}
