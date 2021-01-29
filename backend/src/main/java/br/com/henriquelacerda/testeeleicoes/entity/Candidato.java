package br.com.henriquelacerda.testeeleicoes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//    Descrição: Função que cadastra um candidato para concorrer a um cargo de uma eleição. Este
//    cadastro deve conter o nome do candidato. Os cargos cadastrados devem ser exibidos para que
//    seja selecionado dentro de um combo (select). A tela deve permitir o upload da foto do
//    candidato.
//            Detalhamento: todos os campos devem ser obrigatórios. Caso algum campo não seja
//    preenchido, alertar o usuário da obrigatoriedade do preenchimento. Ao realizar o upload da
//    foto a mesma deve ser exibida na tela em uma área reservada para este fim.
//    Quem pode acessar: administrador

@Entity
@Table(name = "candidatos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



}
