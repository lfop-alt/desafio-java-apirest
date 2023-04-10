package com.dio.desafio.desafiodeprojetojava.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno alunos;
    private LocalDateTime dataDeAvaliacao = LocalDateTime.now();
    private double peso;
    private double altura;
}
