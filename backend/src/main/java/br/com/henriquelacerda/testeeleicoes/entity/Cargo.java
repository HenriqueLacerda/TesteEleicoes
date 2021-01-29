package br.com.henriquelacerda.testeeleicoes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


//    Descrição: Função que cadastra um cargo a ser preenchido pelos candidatos. Este cadastro deve
//    conter somente o nome do cargo.
//    Detalhamento: o nome do cargo é obrigatório. Caso o campo não seja preenchido, alertar o
//    usuário da obrigatoriedade do preenchimento.
//    Quem pode acessar: administrador.

@Entity
@Table(name = "cargos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @NotEmpty
    @Column(name = "nome")
    private String nome;

}
