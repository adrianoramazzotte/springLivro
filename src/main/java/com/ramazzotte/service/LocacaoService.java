package com.ramazzotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Locacao;
import com.ramazzotte.repository.LocacaoRepository;
@Service
public class LocacaoService {
	@Autowired
	private LocacaoRepository locRepo;

	public List<Locacao> findAll() {
		List<Locacao> list = locRepo.findAllCat();

		return list;
	}

	public Locacao findPorId(Integer idlocacao) {
		Locacao loc = locRepo.findPorId(idlocacao);
		return loc;
	}

	public Locacao addLocacao(Locacao loc) {
		return locRepo.save(loc);
	}

	public void deleteLoc(Integer idlocacao) {
		locRepo.deleteById(idlocacao);
		
	}

	public Locacao updateLocacao(Locacao loca) {
		Locacao loc = findPorId(loca.getId());
		loc.setLivro(loca.getLivro());
		return locRepo.save(loc);
	}

}

