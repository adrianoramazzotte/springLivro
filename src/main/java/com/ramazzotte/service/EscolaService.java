package com.ramazzotte.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Escola;
import com.ramazzotte.domain.DTO.EscolaDTO;
import com.ramazzotte.repository.EscolaRepository;
@Service
public class EscolaService {
	@Autowired
	private EscolaRepository escRepo;








	public List<Escola> findAllSql() {
		List<Escola> escolas = escRepo.listaEscola();
		return escolas;
	}

	public Escola addEscola(@Valid Escola edit) {
		// TODO Auto-generated method stub
		return null;
	}



	public void deleteEscola(Integer idEscola) {
		// TODO Auto-generated method stub
		
	}



	public Escola updateEscola(EscolaDTO escola) {
		// TODO Auto-generated method stub
		return null;
	}



	public Escola findPorId(Integer idEscola) {
		Escola esc = escRepo.buscarById(idEscola);
		return esc;
	}


}
