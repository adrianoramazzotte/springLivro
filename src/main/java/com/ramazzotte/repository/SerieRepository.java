package com.ramazzotte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.Serie;



public interface SerieRepository extends JpaRepository<Serie, Integer> {
	@Query(value = "SELECT * FROM serie", nativeQuery = true)
	List<Serie> findAllCat();

	@Query(value = "SELECT * FROM serie where id = ?", nativeQuery = true)
	Serie findPorId(Integer idserie);
}
