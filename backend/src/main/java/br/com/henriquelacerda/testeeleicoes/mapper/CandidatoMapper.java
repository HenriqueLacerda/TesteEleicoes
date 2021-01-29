package br.com.henriquelacerda.testeeleicoes.mapper;

import br.com.henriquelacerda.testeeleicoes.dto.CandidatoDTO;
import br.com.henriquelacerda.testeeleicoes.entity.Candidato;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CandidatoMapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(CandidatoMapper.class);

    private static ModelMapper MAPPER = new ModelMapper();

    public static Candidato dtoToEntity(CandidatoDTO candidatoDTO){
        LOGGER.debug("Converting: request object to entity object");
        return MAPPER.map(candidatoDTO, Candidato.class);
    }

    public static CandidatoDTO entityToDto(Candidato entity) {
        LOGGER.debug("Converting: entity object to response object");
        CandidatoDTO response = MAPPER.map(entity, CandidatoDTO.class);
        return response;
    }
}
