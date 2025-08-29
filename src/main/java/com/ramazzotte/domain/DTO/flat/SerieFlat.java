package com.ramazzotte.domain.DTO.flat;

public class SerieFlat {
	
	private Integer id;
	private String  ano;
	private String turma;
	private String nome;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public SerieFlat(Integer id, String ano, String turma, String nome) {
		super();
		this.id = id;
		this.ano = ano;
		this.turma = turma;
		this.nome = nome;
	}
	public SerieFlat() {
	}

}
