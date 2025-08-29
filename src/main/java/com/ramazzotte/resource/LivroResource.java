package com.ramazzotte.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramazzotte.domain.Livro;
import com.ramazzotte.security.resource.CheckSecurity;
import com.ramazzotte.service.LivroService;



@RestController
@RequestMapping(value = "/livro")
public class LivroResource {

	@Autowired
	private LivroService service;


	@CheckSecurity.Livro.PodeConsultar
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Livro> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@CheckSecurity.Livro.PodeConsultar
	@RequestMapping(value = "/{idlivro}",method = RequestMethod.GET)
	public ResponseEntity<?> findPorId(@PathVariable Integer idlivro ) {
		Livro livro = service.findPorId(idlivro);
		return ResponseEntity.ok().body(livro);
		
	}
	@CheckSecurity.Livro.PodeCadastrar
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addlivro(@RequestBody Livro liv ) {
		Livro livro = service.addLivro(liv);
		return ResponseEntity.created(null).body(livro);
		
	}
	@CheckSecurity.Livro.PodeExcluir
	@RequestMapping(value = "/{idlivro}",method = RequestMethod.DELETE)
	public void deleteLiv(@PathVariable Integer idlivro ) {
		service.deleteLiv(idlivro);
		
		
	}
	@CheckSecurity.Livro.PodeAtualizar
	@RequestMapping(value = "/{idlivro}",method = RequestMethod.PUT)
	public ResponseEntity<?> updateLivro(
			      @PathVariable Integer idlivro, 
			      @RequestBody Livro liv ) {
		liv.setId(idlivro);
		Livro livro = service.updateLivro(liv);
		return ResponseEntity.ok().body(livro);
	
	}

}