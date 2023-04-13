package com.dio.desafio.desafiodeprojetojava.controller;

import com.dio.desafio.desafiodeprojetojava.model.Aluno;
import com.dio.desafio.desafiodeprojetojava.model.AvaliacaoFisica;
import com.dio.desafio.desafiodeprojetojava.repository.AlunoRespository;
import com.dio.desafio.desafiodeprojetojava.repository.AvaliacaoFisicaReposity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("avaliacao")
public class AvaliacaoFisicaController {


    private final AvaliacaoFisicaReposity repository;
    @JsonIgnore
    private final AlunoRespository alunoRespository;

    public AvaliacaoFisicaController(AvaliacaoFisicaReposity repository, AlunoRespository alunoRespository) {
        this.repository = repository;
        this.alunoRespository = alunoRespository;
    }

    @JsonIgnore
    @GetMapping
    public List<AvaliacaoFisica> getAllAvaliacao() {
        return repository.findAll();
    }

    @PostMapping
    public void createAvaliacao(@RequestBody AvaliacaoFisica form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRespository.findById(form.getIdAluno()).get();
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());
        avaliacaoFisica.setAlunos(aluno);
        repository.save(avaliacaoFisica);
    }

    @DeleteMapping( "/{id}")
    public void deleteAvaliacao(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
