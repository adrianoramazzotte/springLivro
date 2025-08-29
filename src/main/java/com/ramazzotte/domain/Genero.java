package com.ramazzotte.domain;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Genero implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String usinsoucriacao;
	private OffsetDateTime datacriacao;
	private String usualteracao;
	private OffsetDateTime dataalteracao;
	public Integer getId() {
		return id;
	}
	

	public OffsetDateTime getDatacriacao() {
		return datacriacao;
	}

	public void setDatacriacao(OffsetDateTime datacriacao) {
		this.datacriacao = datacriacao;
	}

	public String getUsualteracao() {
		return usualteracao;
	}

	public void setUsualteracao(String usualteracao) {
		this.usualteracao = usualteracao;
	}

	public OffsetDateTime getDataalteracao() {
		return dataalteracao;
	}

	public void setDataalteracao(OffsetDateTime dataalteracao) {
		this.dataalteracao = dataalteracao;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Genero(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Genero() {

	}
	

}
