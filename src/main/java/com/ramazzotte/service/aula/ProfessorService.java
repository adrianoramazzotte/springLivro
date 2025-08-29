package com.ramazzotte.service.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.DTO.aula.ProfessorDTO;
import com.ramazzotte.domain.DTO.aula.ProfessorNewDTO;
import com.ramazzotte.domain.aula.Professor;
import com.ramazzotte.repository.aula.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository repo;
	
	public List<Professor> findAll() {
		List<Professor> list = repo.findAll();
		return list;
	}

	public Professor findAllporID(Integer idprofessor) {
		Professor prof = repo.findAllPorid(idprofessor);
		return prof;
	}

	public Professor addProf(ProfessorNewDTO prof) {
	    Professor prof1 = new Professor(prof);
		return repo.save(prof1);
	}

	public void deleteProf(Integer idProfessor) {
		repo.deleteById(idProfessor);
		
	}

	public Professor updateProfessor(ProfessorDTO professor) {
		Professor prof = repo.findAllPorid(professor.getId());
		// BeansUtil
		// ModelMapper
		// lombok
		// fazer do modo manual
		prof.setId(professor.getId());
		prof.setNome(professor.getNome());
	
		return repo.save(prof);
	}

}
