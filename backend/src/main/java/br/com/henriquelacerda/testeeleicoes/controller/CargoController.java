package br.com.henriquelacerda.testeeleicoes.controller;

import br.com.henriquelacerda.testeeleicoes.dto.CargoDTO;
import br.com.henriquelacerda.testeeleicoes.entity.Cargo;
import br.com.henriquelacerda.testeeleicoes.service.CargoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("cargos")
@RequiredArgsConstructor
public class CargoController {

    private final CargoService cargoService;

    @GetMapping
    public ResponseEntity<List<Cargo>> listar() {
        return new ResponseEntity<>(cargoService.listar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cargo> buscarPorId(@RequestParam long id) {
        return new ResponseEntity<>(cargoService.buscarPorId(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Cargo> salvar(@RequestBody @Valid CargoDTO cargo) {
        return new ResponseEntity<>(cargoService.salvar(cargo), HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<Void> alterar(@RequestBody @Valid CargoDTO cargo) {
        cargoService.alterar(cargo);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@RequestParam Long id) {
        cargoService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
