package com.ramazzotte.domain.aula;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "universidade")
public class Universidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)			
	private Integer id;
	private String cnpj;
	private String razao;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public Universidade(Integer id, String cnpj, String razao) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.razao = razao;
	}
	public Universidade() {
		super();
	}
	
	

}
