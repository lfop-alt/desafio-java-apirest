package com.dio.desafio.desafiodeprojetojava.model.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
    @NotEmpty(message = "Campo não pode esta vazio")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracter")
    private String nome;
    @CPF(message = "'validatedValue' é invalido")
    @Size(min = 11, max = 11, message = "'validatedValue' tamanho do CPF invalido")
    private String cpf;
    @NotEmpty(message = "Campo não pode ficar vazio")
    private String bairro;
    @NotEmpty(message = "Campo não pode ficar vazio")
    private LocalDate dataDeNascimento;
}
