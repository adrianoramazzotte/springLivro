package com.ramazzotte.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramazzotte.domain.Genero;
import com.ramazzotte.service.GeneroService;



@RestController
@RequestMapping(value = "/genero")
public class GeneroResource {

	@Autowired
	private GeneroService service;


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Genero> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{idgenero}",method = RequestMethod.GET)
	public ResponseEntity<?> findPorId(@PathVariable Integer idgenero ) {
		Genero genero = service.findPorId(idgenero);
		return ResponseEntity.ok().body(genero);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addgenero(@RequestBody Genero gen ) {
		Genero genero = service.addGenero(gen);
		return ResponseEntity.ok().body(genero);
		
	}
	@RequestMapping(value = "/{idgenero}",method = RequestMethod.DELETE)
	public void deleteGen(@PathVariable Integer idgenero ) {
		service.deleteGen(idgenero);
		
		
	}
	@RequestMapping(value = "/{idgenero}",method = RequestMethod.PUT)
	public ResponseEntity<?> updateGenero(
			      @PathVariable Integer idgenero, 
			      @RequestBody Genero gen ) {
		gen.setId(idgenero);
		Genero genero = service.updateGenero(gen);
		return ResponseEntity.ok().body(genero);
		
	}
}