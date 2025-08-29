package com.ramazzotte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.Livro;



public interface LivroRepository extends JpaRepository<Livro, Integer> {
	@Query(value = "SELECT * FROM livro", nativeQuery = true)
	List<Livro> findAllCat();

	@Query(value = "SELECT * FROM livro where id = ?", nativeQuery = true)
	Livro findPorId(Integer idlivro);

	Livro findByTitulo(String titulo);
}
