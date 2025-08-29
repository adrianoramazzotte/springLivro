package com.ramazzotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Livro;
import com.ramazzotte.repository.LivroRepository;
import com.ramazzotte.service.exception.DataIntegrityException;
import com.ramazzotte.service.exception.EntidadeNaoEncontradaExcepition;
@Service
public class LivroService {
	@Autowired
	private LivroRepository livRepo;

	public List<Livro> findAll() {
		List<Livro> list = livRepo.findAllCat();

		return list;
	}

	public Livro findPorId(Integer idlivro) {
		Livro cat = livRepo.findPorId(idlivro);
		return cat;
	}

	public Livro addLivro(Livro cat) {
		return livRepo.save(cat);
	}

	public void deleteLiv(Integer idlivro) {
		try {
			livRepo.deleteById(idlivro);
		} catch (Exception e) {
			throw new DataIntegrityException("O Livro não pode ser excluído!");			
		}		
	}

	public Livro updateLivro(Livro liv) {
		Livro cat = findPorId(liv.getId());
		if(cat == null) {
			throw new EntidadeNaoEncontradaExcepition("O Livro não pode ser encontrado!");	
		}else {
			cat.setTitulo(liv.getTitulo());
		}
		
		return livRepo.save(liv);
	}
}
