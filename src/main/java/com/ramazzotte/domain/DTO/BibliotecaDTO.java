package com.ramazzotte.domain.DTO;

import java.time.OffsetDateTime;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import com.ramazzotte.domain.Endereco;
import com.ramazzotte.validation.biblioteca.BibliotecaUpdate;
@BibliotecaUpdate
public class BibliotecaDTO {
	
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
	public BibliotecaDTO(Integer id, String nome, Endereco endereco, String usucriacao, OffsetDateTime datacriacao,
			String usualteracao, OffsetDateTime dataalteracao) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.usucriacao = usucriacao;
		this.datacriacao = datacriacao;
		this.usualteracao = usualteracao;
		this.dataalteracao = dataalteracao;
	}
	public BibliotecaDTO() {

	}
	
	

}
