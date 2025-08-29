package com.ramazzotte.domain.DTO.aula;

import com.ramazzotte.validation.professor.ProfessorInsert;

@ProfessorInsert
public class ProfessorNewDTO {
	
	private Integer id;
	private String cpf;
	private String nome;
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
	public ProfessorNewDTO(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public ProfessorNewDTO() {
	}
	
	

}
