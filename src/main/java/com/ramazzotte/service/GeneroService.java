package com.ramazzotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Genero;
import com.ramazzotte.repository.GeneroRepository;
@Service
public class GeneroService {
	@Autowired
	private GeneroRepository genRepo;

	public List<Genero> findAll() {
		List<Genero> list = genRepo.findAllCat();

		return list;
	}

	public Genero findPorId(Integer idgenero) {
		Genero cat = genRepo.findPorId(idgenero);
		return cat;
	}

	public Genero addGenero(Genero cat) {
		return genRepo.save(cat);
	}

	public void deleteGen(Integer idgenero) {
		genRepo.deleteById(idgenero);
		
	}

	public Genero updateGenero(Genero gen) {
		Genero cat = findPorId(gen.getId());
		cat.setNome(gen.getNome());
		return genRepo.save(cat);
	}
}
