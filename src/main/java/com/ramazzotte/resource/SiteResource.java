package com.ramazzotte.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramazzotte.domain.Codigo;
import com.ramazzotte.domain.Editora;
import com.ramazzotte.domain.Usuario;
import com.ramazzotte.repository.UsuarioRepository;
import com.ramazzotte.service.EditoraService;
import com.ramazzotte.service.ServicosResquestAllAIP;


@RestController
@RequestMapping(value = "/d/")
public class SiteResource {
	@Autowired
	private UsuarioRepository repoUsu;
	@Autowired
	private ServicosResquestAllAIP serviceApi;
	@Autowired
	private EditoraService serviceEditora;

	///////////SMS//////////
	@RequestMapping(value = "/sms/{telefone}",method = RequestMethod.PUT)
	public void sms(@PathVariable String telefone) {

		Usuario usu = repoUsu.findPorTelefone(telefone);
		if(usu == null) {
			String resposta = serviceApi.enviarSms(telefone);
		}else {
			Codigo codigo = serviceApi.buscarOuFalhar2(0);
		}
		
	
	}
	@RequestMapping(value = "/validasms",method = RequestMethod.POST)
	public ResponseEntity<?> validasms(@RequestBody Codigo obj1) {
		Codigo resposta = serviceApi.validaSMSs(obj1);
		return ResponseEntity.ok().body(resposta);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Editora> list = serviceEditora.findAll();
		return ResponseEntity.ok().body(list);
	}

	




}