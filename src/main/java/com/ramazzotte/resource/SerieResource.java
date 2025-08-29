package com.ramazzotte.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramazzotte.domain.Serie;
import com.ramazzotte.service.SerieService;



@RestController
@RequestMapping(value = "/serie")
public class SerieResource {

	@Autowired
	private SerieService service;


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Serie> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{idserie}",method = RequestMethod.GET)
	public ResponseEntity<?> findPorId(@PathVariable Integer idserie ) {
		Serie serie = service.findPorId(idserie);
		return ResponseEntity.ok().body(serie);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addserie(@RequestBody Serie ser ) {
		Serie serie = service.addSerie(ser);
		return ResponseEntity.ok().body(serie);
		
	}
	@RequestMapping(value = "/{idserie}",method = RequestMethod.DELETE)
	public void deleteSer(@PathVariable Integer idserie ) {
		service.deleteSer(idserie);
		
		
	}
	@RequestMapping(value = "/{idserie}",method = RequestMethod.PUT)
	public ResponseEntity<?> updateSerie(
			      @PathVariable Integer idserie, 
			      @RequestBody Serie ser ) {
		ser.setId(idserie);
		Serie serie = service.updateSer(ser);
		return ResponseEntity.ok().body(serie);
		
	}


}