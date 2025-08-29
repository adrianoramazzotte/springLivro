package com.ramazzotte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.Reserva;



public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
	@Query(value = "SELECT * FROM reserva", nativeQuery = true)
	List<Reserva> findAllCat();

	@Query(value = "SELECT * FROM reserva where id = ?", nativeQuery = true)
	Reserva findPorId(Integer idreserva);
}
