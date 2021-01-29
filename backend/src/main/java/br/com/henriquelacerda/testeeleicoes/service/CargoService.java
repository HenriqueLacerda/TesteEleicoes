package br.com.henriquelacerda.testeeleicoes.service;

import br.com.henriquelacerda.testeeleicoes.dto.CargoDTO;
import br.com.henriquelacerda.testeeleicoes.entity.Cargo;
import br.com.henriquelacerda.testeeleicoes.exception.BadRequestException;
import br.com.henriquelacerda.testeeleicoes.mapper.CargoMapper;
import br.com.henriquelacerda.testeeleicoes.repository.CargoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CargoService {

    private final CargoRepository cargoRepository;

    public List<Cargo> listar() {
        return cargoRepository.findAll();
    }

    public Cargo buscarPorId(long id){
        return cargoRepository.findById(id).orElseThrow(() -> new BadRequestException("Cargo não encontrado"));
    }

    @Transactional(rollbackFor = Exception.class)
    public Cargo salvar(CargoDTO cargoDTO) {
        Cargo cargo = CargoMapper.dtoToEntity(cargoDTO);
        return cargoRepository.save(cargo);
    }

    @Transactional(rollbackFor = Exception.class)
    public void alterar(CargoDTO cargoDTO) {
        Cargo cargo = new Cargo();
        cargo = buscarPorId(cargoDTO.getId());
        cargo.setNome(cargoDTO.getNome());
        cargoRepository.save(cargo);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deletar(Long id) {
        cargoRepository.delete(buscarPorId(id));
    }
}
