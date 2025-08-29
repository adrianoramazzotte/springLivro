package com.ramazzotte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.Genero;



public interface GeneroRepository extends JpaRepository<Genero, Integer> {
	@Query(value = "SELECT * FROM genero", nativeQuery = true)
	List<Genero> findAllCat();

	@Query(value = "SELECT * FROM genero where id = ?", nativeQuery = true)
	Genero findPorId(Integer idgenero);

	Genero findByNome(String nome);
}
