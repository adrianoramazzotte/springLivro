package com.ramazzotte.domain.DTO;

import com.ramazzotte.domain.Biblioteca;
import com.ramazzotte.domain.Endereco;
import com.ramazzotte.validation.escola.EscolaUpdate;
@EscolaUpdate
public class EscolaDTO {
	private Integer id;
	private Biblioteca biblio;
	private String nome;
	private String cnpj;
	private String email;
	private Endereco endereco;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Biblioteca getBiblio() {
		return biblio;
	}
	public void setBiblio(Biblioteca biblio) {
		this.biblio = biblio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public EscolaDTO(Integer id, Biblioteca biblio, String nome, String cnpj, String email, Endereco endereco) {
		super();
		this.id = id;
		this.biblio = biblio;
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.endereco = endereco;
	}
	public EscolaDTO() {

	}
	

}
