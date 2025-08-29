package com.ramazzotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Editora;
import com.ramazzotte.repository.EditoraRepository;
@Service
public class EditoraService {
	@Autowired
	private EditoraRepository ediRepo;

	public List<Editora> findAll() {
		List<Editora> list = ediRepo.findAllCat();

		return list;
	}

	public Editora findPorId(Integer ideditora) {
		Editora cat = ediRepo.findPorId(ideditora);
		return cat;
	}

	public Editora addEditora(Editora cat) {
		return ediRepo.save(cat);
	}

	public void deleteEditora(Integer ideditora) {
		ediRepo.deleteById(ideditora);
		
	}

	public Editora updateEditora(Editora categ) {
		Editora cat = findPorId(categ.getId());
		cat.setRazao(categ.getRazao());
		return ediRepo.save(cat);
	}
}
