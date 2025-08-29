package com.ramazzotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Reserva;
import com.ramazzotte.repository.ReservaRepository;
@Service
public class ReservaService {
	@Autowired
	private ReservaRepository resRepo;

	public List<Reserva> findAll() {
		List<Reserva> list = resRepo.findAllCat();

		return list;
	}

	public Reserva findPorId(Integer idreserva) {
		Reserva re = resRepo.findPorId(idreserva);
		return re;
	}

	public Reserva addReserva(Reserva res) {
		return resRepo.save(res);
	}

	public void deleteRes(Integer idreserva) {
		resRepo.deleteById(idreserva);
		
	}

	public Reserva updateReserva(Reserva res) {
		Reserva re = findPorId(res.getId());
		re.setLivro(res.getLivro());
		return resRepo.save(re);
	}
}
