package com.dio.desafio.desafiodeprojetojava.controller;

import com.dio.desafio.desafiodeprojetojava.model.Aluno;
import com.dio.desafio.desafiodeprojetojava.model.Matricula;
import com.dio.desafio.desafiodeprojetojava.repository.AlunoRespository;
import com.dio.desafio.desafiodeprojetojava.repository.MatriculaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {

    private final AlunoRespository alunoRespository;
    private  final MatriculaRepository matriculaRepository;

    public MatriculaController(AlunoRespository alunoRespository, MatriculaRepository matriculaRepository) {
        this.alunoRespository = alunoRespository;
        this.matriculaRepository = matriculaRepository;
    }

    @PostMapping
    public Matricula createMatricula(@RequestBody Matricula form) {
        Matricula newMat = new Matricula();
        Aluno aluno = alunoRespository.findById(form.getId()).get();
        newMat.setAluno(aluno);
        return matriculaRepository.save(newMat);
    }

    @GetMapping
    public List<Matricula> getAllMatricula() {
        return matriculaRepository.findAll();
    }
}
