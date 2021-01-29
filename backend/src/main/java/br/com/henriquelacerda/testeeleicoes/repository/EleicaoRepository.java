package br.com.henriquelacerda.testeeleicoes.repository;

import br.com.henriquelacerda.testeeleicoes.entity.Eleicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleicaoRepository extends JpaRepository<Eleicao, Long> {

}
