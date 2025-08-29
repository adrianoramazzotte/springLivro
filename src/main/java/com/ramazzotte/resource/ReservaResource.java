package com.ramazzotte.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramazzotte.domain.Reserva;
import com.ramazzotte.service.ReservaService;



@RestController
@RequestMapping(value = "/reserva")
public class ReservaResource {

	@Autowired
	private ReservaService service;


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Reserva> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{idreserva}",method = RequestMethod.GET)
	public ResponseEntity<?> findPorId(@PathVariable Integer idreserva ) {
		Reserva reserva = service.findPorId(idreserva);
		return ResponseEntity.ok().body(reserva);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addreserva(@RequestBody Reserva res ) {
		Reserva reserva = service.addReserva(res);
		return ResponseEntity.ok().body(reserva);
		
	}
	@RequestMapping(value = "/{idreserva}",method = RequestMethod.DELETE)
	public void deleteRes(@PathVariable Integer idreserva ) {
		service.deleteRes(idreserva);
		
		
	}
	@RequestMapping(value = "/{idreserva}",method = RequestMethod.PUT)
	public ResponseEntity<?> updateReserva(
			      @PathVariable Integer idreserva, 
			      @RequestBody Reserva res ) {
		res.setId(idreserva);
		Reserva reserva = service.updateReserva(res);
		return ResponseEntity.ok().body(reserva);
		
	}


}