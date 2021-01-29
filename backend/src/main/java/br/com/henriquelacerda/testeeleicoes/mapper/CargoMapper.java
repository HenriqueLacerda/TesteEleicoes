package br.com.henriquelacerda.testeeleicoes.mapper;

import br.com.henriquelacerda.testeeleicoes.dto.CargoDTO;
import br.com.henriquelacerda.testeeleicoes.entity.Cargo;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CargoMapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(CargoMapper.class);

    private static ModelMapper MAPPER = new ModelMapper();

    public static Cargo dtoToEntity(CargoDTO cargoDTO){
        LOGGER.debug("Converting: request object to entity object");
        return MAPPER.map(cargoDTO, Cargo.class);
    }

    public static CargoDTO entityToDto(Cargo entity) {
        LOGGER.debug("Converting: entity object to response object");
        CargoDTO response = MAPPER.map(entity, CargoDTO.class);
        return response;
    }
}
