package com.ramazzotte.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramazzotte.domain.Biblioteca;
import com.ramazzotte.domain.DTO.BibliotecaNewDTO;
import com.ramazzotte.service.BibliotecaService;




@RestController
@RequestMapping(value = "/biblioteca")
public class BibliotecaResource {

	@Autowired
	private BibliotecaService service;


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Biblioteca> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{idbiblioteca}",method = RequestMethod.GET)
	public ResponseEntity<?> findPorId(@PathVariable Integer idbiblioteca ) {
		Biblioteca biblioteca = service.findPorId(idbiblioteca);
		return ResponseEntity.ok().body(biblioteca);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addbiblioteca(@Valid @RequestBody BibliotecaNewDTO bib ) {	
		System.out.println("Linha 43");
		Biblioteca biblioteca = service.addBiblioteca(bib);
		return ResponseEntity.ok().body(biblioteca);
		
	}
	@RequestMapping(value = "/{idbiblioteca}",method = RequestMethod.DELETE)
	public void deleteBib(@PathVariable Integer idbiblioteca ) {
		service.deleteBib(idbiblioteca);
		
		
	}
	@RequestMapping(value = "/{idbiblioteca}",method = RequestMethod.PUT)
	public ResponseEntity<?> updateBiblioteca(
			      @PathVariable Integer idbiblioteca, 
			      @RequestBody Biblioteca bib ) {
		bib.setId(idbiblioteca);
		Biblioteca biblioteca = service.updateBiblioteca(bib);
		return ResponseEntity.ok().body(biblioteca);
		
	}



}