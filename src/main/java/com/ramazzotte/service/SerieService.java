package com.ramazzotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Serie;
import com.ramazzotte.repository.SerieRepository;
@Service
public class SerieService {
	@Autowired
	private SerieRepository serRepo;

	public List<Serie> findAll() {
		List<Serie> list = serRepo.findAllCat();

		return list;
	}

	public Serie findPorId(Integer idserie) {
		Serie ser = serRepo.findPorId(idserie);
		return ser;
	}

	public Serie addSerie(Serie ser) {
		return serRepo.save(ser);
	}

	public void deleteSer(Integer idserie) {
		serRepo.deleteById(idserie);
		
	}

	public Serie updateSer(Serie seri) {
		Serie ser = findPorId(seri.getId());
		ser.setAno(seri.getAno());
		ser.setTurma(seri.getTurma());
		ser.setNome(seri.getNome());
		return serRepo.save(ser);
	}
}
