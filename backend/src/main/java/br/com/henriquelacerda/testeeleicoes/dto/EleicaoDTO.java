package br.com.henriquelacerda.testeeleicoes.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


//    Descrição: Função que cadastra uma eleição a ser realizada. Este cadastro deve conter o nome
//    da eleição e as datas de início e fim dela.
//    Detalhamento: todos os campos devem ser obrigatórios. Caso algum campo não seja
//    preenchido, alertar o usuário da obrigatoriedade do preenchimento.
//    Quem pode acessar: administrador.


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EleicaoDTO {

    private long id;
    @NotEmpty(message = "Preencha o nome da Eleição")
    @NotNull(message = "Preencha o nome da Eleição")
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotEmpty(message = "Preencha a Data Inicial da Eleição")
    @NotNull(message = "Preencha a Data Inicial da Eleição")
    private Date dataInicial;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotEmpty(message = "Preencha a Data Final da Eleição")
    @NotNull(message = "Preencha a Data Final da Eleição")
    private Date dataFinal;

}
