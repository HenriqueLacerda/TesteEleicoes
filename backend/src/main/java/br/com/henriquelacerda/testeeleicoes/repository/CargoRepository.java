package br.com.henriquelacerda.testeeleicoes.repository;

import br.com.henriquelacerda.testeeleicoes.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
