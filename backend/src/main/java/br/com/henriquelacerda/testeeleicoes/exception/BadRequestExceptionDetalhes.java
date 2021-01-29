package br.com.henriquelacerda.testeeleicoes.exception;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@SuperBuilder
public class BadRequestExceptionDetalhes extends ExceptionDatalhes{

}
