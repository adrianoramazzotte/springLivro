package com.ramazzotte.domain;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ramazzotte.domain.DTO.EditoraNewDTO;
@Entity
public class Editora implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String razao;
	private String telefone;
	private String usucriacao;
	private OffsetDateTime datacriacao;
	private String usualteracao;
	private OffsetDateTime dataalteracao;
	private String email;
	private String cpfoucnpjnpj;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpfoucnpjnpj() {
		return cpfoucnpjnpj;
	}
	public void setCpfoucnpjnpj(String cpfoucnpjnpj) {
		this.cpfoucnpjnpj = cpfoucnpjnpj;
	}
	public Editora(Integer id, String razao, String telefone, String email, String cpfoucnpjnpj) {
		super();
		this.id = id;
		this.razao = razao;
		this.telefone = telefone;
		this.email = email;
		this.cpfoucnpjnpj = cpfoucnpjnpj;
	}
	public Editora() {

	}
	
	public Editora(EditoraNewDTO obj) {
		this.id = obj.getId();
		this.razao = obj.getRazao();
		this.telefone = obj.getTelefone();
		this.email = obj.getEmail();
		this.cpfoucnpjnpj = obj.getCpfoucnpjnpj();
	}

}
