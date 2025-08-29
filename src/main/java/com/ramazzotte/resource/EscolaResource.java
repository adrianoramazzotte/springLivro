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

import com.ramazzotte.domain.Escola;
import com.ramazzotte.domain.DTO.EscolaDTO;
import com.ramazzotte.service.EscolaService;



@RestController
@RequestMapping(value = "/escola")
public class EscolaResource {

	@Autowired
	private EscolaService service;


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Escola> list = service.findAllSql();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{idEscola}",method = RequestMethod.GET)
	public ResponseEntity<?> findPorId(@PathVariable Integer idEscola ) {
		Escola Escola = service.findPorId(idEscola);
		return ResponseEntity.ok().body(Escola);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addbiblioteca(@Valid @RequestBody Escola edit ) {
		Escola Escola = service.addEscola(edit);
		return ResponseEntity.ok().body(Escola);
		
	}
	@RequestMapping(value = "/{idEscola}",method = RequestMethod.DELETE)
	public void deleteEdit(@PathVariable Integer idEscola ) {
		service.deleteEscola(idEscola);
		
		
	}
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<?> updateEscola(
			      @PathVariable Integer id, @Valid
			      @RequestBody EscolaDTO escola ) {
		escola.setId(id);
		Escola Escola = service.updateEscola(escola);
		return ResponseEntity.ok().body(Escola);

}
}