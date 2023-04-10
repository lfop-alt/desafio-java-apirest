package com.dio.desafio.desafiodeprojetojava.controller;

import com.dio.desafio.desafiodeprojetojava.model.Aluno;
import com.dio.desafio.desafiodeprojetojava.repository.AlunoRespository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoRespository repository;

    public AlunoController(AlunoRespository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<Aluno> getAllAlunos() {
        return repository.findAll();
    }

    @PostMapping
    public Aluno create(@RequestBody Aluno form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setAvaliacoes(form.getAvaliacoes());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        return repository.save(aluno);
    }

}
