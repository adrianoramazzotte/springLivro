package com.ramazzotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Biblioteca;
import com.ramazzotte.domain.DTO.BibliotecaNewDTO;
import com.ramazzotte.repository.BibliotecaRepository;

@Service
public class BibliotecaService {
	@Autowired
	private BibliotecaRepository bibRepo;

	public List<Biblioteca> findAll() {
		List<Biblioteca> list = bibRepo.findAllCat();

		return list;
	}

	public Biblioteca findPorId(Integer idbiblioteca) {
		Biblioteca cat = bibRepo.findPorId(idbiblioteca);
		return cat;
	}

	public Biblioteca addBiblioteca(BibliotecaNewDTO obj) {
		Biblioteca biblioteca = new Biblioteca(obj);
		return bibRepo.save(biblioteca);
	}

	public void deleteBib(Integer idbiblioteca) {
		bibRepo.deleteById(idbiblioteca);
		
	}

	public Biblioteca updateBiblioteca(Biblioteca biblio) {
		Biblioteca bib = findPorId(biblio.getId());
		bib.setNome(biblio.getNome());
		bib.setEndereco(biblio.getEndereco());
		return bibRepo.save(bib);
	}

}
