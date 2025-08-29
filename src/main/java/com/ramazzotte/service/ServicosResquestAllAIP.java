package com.ramazzotte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ramazzotte.domain.Codigo;
import com.ramazzotte.domain.DTO.CepDTOAPI;
import com.ramazzotte.domain.flat.brasilapi.Coordinates;
import com.ramazzotte.repository.CodigoRepository;
import com.ramazzotte.service.exception.EntidadeNaoEncontradaExcepition;

import reactor.core.publisher.Mono;



@Service
public class ServicosResquestAllAIP {

	@Autowired
	private WebClient webClient;
	@Autowired
	private CodigoRepository repoCodigo;


	public String enviarSms(String telefone) {
		int min = 10000;
		int max = 99999;
		int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

		Mono<String> aaaa = this.webClient.method(HttpMethod.GET)
				.uri("https://api.iagentesms.com.br/webservices/http.php?metodo=envio" 
						+ "&usuario=adriano.ramazzotte@gmail.com"
						+ "&senha=senhakroton" 
						+ "&celular=" + telefone 
						+ "&mensagem=Livro informa:  " + random_int)
				.retrieve().bodyToMono(String.class);

		String resposta = aaaa.block();

		Codigo codigobanco = repoCodigo.findPorTelefone(telefone);
		if (codigobanco == null) {
			Codigo c = new Codigo();
			c.setTelefona(telefone);
			c.setCodigo(String.valueOf(random_int));
			repoCodigo.save(c);
		} else {
			codigobanco.setCodigo(String.valueOf(random_int));
			repoCodigo.save(codigobanco);
		}

		if (!resposta.equals("OK")) {
			return resposta;

		} else {
			return resposta;
		}

	}

	public String enviarSmsSenha(String telefone, String senha) {

		Mono<String> cnpj = this.webClient.method(HttpMethod.GET)
				.uri("https://api.iagentesms.com.br/webservices/http.php?metodo=envio" 
						+ "&usuario=email"
						+ "&senha=senha" 
						+ "&celular=" 
						+ telefone 
						+ "&mensagem=PortoBR Nova Senha: " 
						+ senha)
				.retrieve().bodyToMono(String.class);

		String resposta = cnpj.block();
		if (resposta == "OK") {
			return senha;
		} else {
			return resposta;
		}

	}

	public Codigo buscarOuFalhar(int id) {
		return repoCodigo.findById(id)
				.orElseThrow(() -> new EntidadeNaoEncontradaExcepition(String.format("Número não encontrado", id)));
	}

	public Codigo validaSMSs(Codigo obj1) {
		Codigo codigobanco = repoCodigo.findByTelefone(obj1.getTelefone());

		if (codigobanco == null) {
			codigobanco = buscarOuFalhar(0);

		} else {
			if (!codigobanco.getCodigo().equals(obj1.getCodigo())) {
				codigobanco = buscarOuFalhar1(0);

			}
		}
		return codigobanco;
	}

	private Codigo buscarOuFalhar1(int id) {
		return repoCodigo.findById(id)
				.orElseThrow(() -> new EntidadeNaoEncontradaExcepition(String.format("Código inválido", id)));
	}

	public Codigo buscarOuFalhar2(int id) {
		return repoCodigo.findById(id)
				.orElseThrow(() -> new EntidadeNaoEncontradaExcepition(String.format("Telefone já cadastrado", id)));
	}

	public Coordinates buscarLatLog(String cepfront) {
		Mono<CepDTOAPI> cep = this.webClient.method(HttpMethod.GET)
				.uri("https://brasilapi.com.br/api/cep/v2/{cep}", cepfront)
				.retrieve()
				.bodyToMono(CepDTOAPI.class);
		CepDTOAPI cepInfo = cep.block();
		return cepInfo.getLocation().getCoordinates();
	}
}

