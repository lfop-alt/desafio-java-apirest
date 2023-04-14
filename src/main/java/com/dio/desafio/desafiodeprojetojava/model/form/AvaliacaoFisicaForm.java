package com.dio.desafio.desafiodeprojetojava.model.form;

import com.dio.desafio.desafiodeprojetojava.model.Aluno;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisicaForm {
    @NotEmpty(message = "Campo nao pode ser vazio")
    @NotNull(message = "campo não pode ser Null")
    private double peso;
    @NotEmpty(message = "Campo nao pode ser vazio")
    @NotNull(message = "campo não pode ser Null")
    private double altura;

    private Aluno aluno;

}
