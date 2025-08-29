package com.ramazzotte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.Biblioteca;




public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer> {
	@Query(value = "SELECT * FROM biblioteca", nativeQuery = true)
	List<Biblioteca> findAllCat();

	@Query(value = "SELECT * FROM biblioteca where id = ?", nativeQuery = true)
	Biblioteca findPorId(Integer idgbiblioteca);



	Biblioteca findByNome(String nome);

	

}
