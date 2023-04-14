package com.dio.desafio.desafiodeprojetojava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


import java.time.LocalDateTime;

@Data
@Entity
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    @JsonIgnore
    private Aluno alunos;
    private LocalDateTime dataDeAvaliacao = LocalDateTime.now();
    private double peso;
    private double altura;
}
