package com.ramazzotte.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Escola implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	@JsonIgnore
	private Biblioteca biblio;
	private String nome;
	private String cnpj;
	private String email;
	@OneToOne
	private Endereco endereco;
	public Integer getId() {
		return id;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Escola(Integer id, Biblioteca biblio, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.biblio = biblio;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Escola() {

	}
	
	

	

}
