package br.com.henriquelacerda.testeeleicoes.entity;


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

@Entity
@Table(name = "eleicoes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eleicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @NotEmpty
    @Column(name = "nome")
    private String nome;
    @NotNull
    @NotEmpty
    @Column(name = "data_inicial")
    private Date dataInicial;
    @NotNull
    @NotEmpty
    @Column(name = "data_final")
    private Date dataFinal;


}
