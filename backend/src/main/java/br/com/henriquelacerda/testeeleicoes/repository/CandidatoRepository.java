package br.com.henriquelacerda.testeeleicoes.repository;

import br.com.henriquelacerda.testeeleicoes.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
