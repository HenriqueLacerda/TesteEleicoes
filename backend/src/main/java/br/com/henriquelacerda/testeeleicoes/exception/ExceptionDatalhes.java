package br.com.henriquelacerda.testeeleicoes.exception;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
public class ExceptionDatalhes {

    private LocalDateTime dataHora;
    private int status;
    private String titulo;
    private String detalhes;

}
