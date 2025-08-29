package com.ramazzotte.domain.DTO.aula;

import com.ramazzotte.validation.professor.ProfessorUpdate;

@ProfessorUpdate
public class ProfessorDTO {

	private Integer id;
	private String cpf;
	private String nome;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ProfessorDTO(Integer id, String cpf, String nome) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public ProfessorDTO() {

	}
	
	
}
