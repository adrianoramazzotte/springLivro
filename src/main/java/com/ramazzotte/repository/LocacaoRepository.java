package com.ramazzotte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.Livro;
import com.ramazzotte.domain.Locacao;



public interface LocacaoRepository extends JpaRepository<Locacao, Integer> {
	@Query(value = "SELECT * FROM locacao", nativeQuery = true)
	List<Locacao> findAllCat();

	@Query(value = "SELECT * FROM locacao where id = ?", nativeQuery = true)
	Locacao findPorId(Integer idlocacao);

	Locacao findByLivro(Livro livro);
}
