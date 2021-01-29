package br.com.henriquelacerda.testeeleicoes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CargoDTO {

    private long id;
    @NotEmpty(message = "Preencha o nome do Cargo")
    @NotNull(message = "Preencha o nome do Cargo")
    private String nome;

}
