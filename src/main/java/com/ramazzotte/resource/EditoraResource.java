package com.ramazzotte.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramazzotte.domain.Editora;
import com.ramazzotte.security.resource.CheckSecurity;
import com.ramazzotte.service.EditoraService;



@RestController
@RequestMapping(value = "/editora")
public class EditoraResource {

	@Autowired
	private EditoraService service;

	@CheckSecurity.Editora.PodeConsultar
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CATEGORIA')" )
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Editora> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@RequestMapping(value = "/{ideditora}",method = RequestMethod.GET)
	public ResponseEntity<?> findPorId(@PathVariable Integer ideditora ) {
		Editora editora = service.findPorId(ideditora);
		return ResponseEntity.ok().body(editora);
		
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addbiblioteca(@Valid @RequestBody Editora edit ) {
		Editora editora = service.addEditora(edit);
		return ResponseEntity.ok().body(editora);
		
	}
	@RequestMapping(value = "/{ideditora}",method = RequestMethod.DELETE)
	public void deleteEdit(@PathVariable Integer ideditora ) {
		service.deleteEditora(ideditora);
		
		
	}
	@RequestMapping(value = "/{ideditora}",method = RequestMethod.PUT)
	public ResponseEntity<?> updateEditora(
			      @PathVariable Integer ideditora, 
			      @RequestBody Editora edit ) {
		edit.setId(ideditora);
		Editora editora = service.updateEditora(edit);
		return ResponseEntity.ok().body(editora);

}
}