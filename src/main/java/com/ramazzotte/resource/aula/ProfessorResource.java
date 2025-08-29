package com.ramazzotte.resource.aula;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramazzotte.domain.DTO.aula.ProfessorDTO;
import com.ramazzotte.domain.DTO.aula.ProfessorNewDTO;
import com.ramazzotte.domain.aula.Professor;
import com.ramazzotte.service.aula.ProfessorService;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorResource {
	
	
	@Autowired
	private ProfessorService service;
	

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Professor> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{idprofessor}",method = RequestMethod.GET)
	public ResponseEntity<?> findAll(@PathVariable Integer idprofessor) {
		Professor prof = service.findAllporID(idprofessor);
		return ResponseEntity.ok().body(prof);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addProfessor(@Valid @RequestBody ProfessorNewDTO prof ) {		
		Professor biblioteca = service.addProf(prof);
		return ResponseEntity.ok().body(biblioteca);
		
	}
	@RequestMapping(value = "/{idProfessor}",method = RequestMethod.DELETE)
	public void deleteBib(@PathVariable Integer idProfessor ) {
		service.deleteProf(idProfessor);
		
		
	}
	@RequestMapping(value = "/{idProfessor}",method = RequestMethod.PUT)
	public ResponseEntity<?> updateProfessor(@PathVariable Integer idProfessor,@Valid  @RequestBody ProfessorDTO prof ) {
		prof.setId(idProfessor);
		Professor biblioteca = service.updateProfessor(prof);
		return ResponseEntity.ok().body(biblioteca);
		
	}
	
	
	

}
