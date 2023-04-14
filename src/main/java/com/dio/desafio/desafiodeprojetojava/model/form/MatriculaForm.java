package com.dio.desafio.desafiodeprojetojava.model.form;

import jakarta.validation.constraints.Positive;

public class MatriculaForm {
    @Positive(message = "numero precisa ser positivo")
    private Long id;
}
