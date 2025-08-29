package com.ramazzotte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.Escola;



public interface EscolaRepository extends JpaRepository<Escola, Integer> {
	@Query(value = "SELECT * FROM escola where cnpj = ?", nativeQuery = true)
	Escola buscarByCnpj(String cnpj);
	
	@Query(value = "SELECT * FROM escola where id = ?", nativeQuery = true)
	Escola buscarById(Integer id);
	
	@Query(value = "SELECT * FROM escola", nativeQuery = true)
	List<Escola> listaEscola();

	Escola findByNome(String nome);

	Escola findByEmail(String email);

}
