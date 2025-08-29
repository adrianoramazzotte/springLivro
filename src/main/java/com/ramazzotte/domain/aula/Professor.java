package com.ramazzotte.domain.aula;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ramazzotte.domain.DTO.aula.ProfessorNewDTO;

@Entity
@Table(name = "professor")
public class Professor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private Integer id;
	private String nome;
	private String cpf;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Professor() {
		super();
	}
	public Professor(ProfessorNewDTO obj) {
		
		this.id = null;
		this.nome = obj.getNome();
		this.cpf = obj.getCpf();
		
	}
	
	

}
