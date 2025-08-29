package com.ramazzotte.domain;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.ramazzotte.domain.DTO.BibliotecaNewDTO;
@Entity
public class Biblioteca implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;		
	private String nome;
	@OneToOne(cascade = CascadeType.ALL)
	
	private Endereco endereco;
	private String usucriacao;
	private OffsetDateTime datacriacao;
	private String usualteracao;
	private OffsetDateTime dataalteracao;
	public Integer getId() {
		return id;
	}
	
	public String getUsucriacao() {
		return usucriacao;
	}

	public void setUsucriacao(String usucriacao) {
		this.usucriacao = usucriacao;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Biblioteca(Integer id, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Biblioteca() {

	}

	public Biblioteca(BibliotecaNewDTO obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.endereco = obj.getEndereco();
	}




}
