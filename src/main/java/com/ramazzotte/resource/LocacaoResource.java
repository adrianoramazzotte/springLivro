package com.ramazzotte.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramazzotte.domain.Locacao;
import com.ramazzotte.service.LocacaoService;



@RestController
@RequestMapping(value = "/locacao")
public class LocacaoResource {

	@Autowired
	private LocacaoService service;


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Locacao> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{idlocacao}",method = RequestMethod.GET)
	public ResponseEntity<?> findPorId(@PathVariable Integer idlocacao ) {
		Locacao locacao = service.findPorId(idlocacao);
		return ResponseEntity.ok().body(locacao);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addlocacao(@RequestBody Locacao loc ) {
		Locacao locacao = service.addLocacao(loc);
		return ResponseEntity.ok().body(locacao);
		
	}
	@RequestMapping(value = "/{idlocacao}",method = RequestMethod.DELETE)
	public void deleteLoc(@PathVariable Integer idlocacao ) {
		service.deleteLoc(idlocacao);
		
		
	}
	@RequestMapping(value = "/{idlocacao}",method = RequestMethod.PUT)
	public ResponseEntity<?> updateLocacao(
			      @PathVariable Integer idlocacao, 
			      @RequestBody Locacao loc ) {
		loc.setId(idlocacao);
		Locacao locacao = service.updateLocacao(loc);
		return ResponseEntity.ok().body(locacao);
		
	}


}