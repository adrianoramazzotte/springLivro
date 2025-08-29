package com.ramazzotte.repository.aula;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.aula.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

	@Query(value = "SELECT * FROM professor", nativeQuery = true)
	List<Professor> findAllt();
	@Query(value = "SELECT * FROM professor where id = ?", nativeQuery = true)
	Professor findAllPorid(Integer id);
	
	
	Professor findByNome(String nome);
	Professor findByCpf(String cpf);
}
