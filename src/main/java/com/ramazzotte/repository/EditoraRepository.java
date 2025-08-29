package com.ramazzotte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.Editora;



public interface EditoraRepository extends JpaRepository<Editora, Integer> {
	@Query(value = "SELECT * FROM editora", nativeQuery = true)
	List<Editora> findAllCat();

	@Query(value = "SELECT * FROM editora where id = ?", nativeQuery = true)
	Editora findPorId(Integer ideditora);

	Editora findByRazao(String razao);

	
}
