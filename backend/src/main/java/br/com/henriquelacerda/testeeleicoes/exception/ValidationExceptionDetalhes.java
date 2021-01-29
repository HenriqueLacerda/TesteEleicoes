package br.com.henriquelacerda.testeeleicoes.exception;

import jdk.vm.ci.meta.ExceptionHandler;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ValidationExceptionDetalhes extends ExceptionDatalhes {

    private String campo;
    private String campoMensagem;
}
