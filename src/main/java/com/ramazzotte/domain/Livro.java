package com.ramazzotte.domain;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String autor;
	private String ano;
	private String classificacao;
	@ManyToOne
	private Editora editora;
	private String codigo;
	
	private Date dataCadastro;
	@ManyToOne
	private Genero genero;
	@ManyToOne
	private Biblioteca biblioteca;
	private String usucriacao;
	private OffsetDateTime datacriacao;
	private String usualteracao;
	private OffsetDateTime dataalteracao;
	private String status;
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}
	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Livro(Integer id, String titulo, String autor, String ano, String classificacao, Editora editora,
			String codigo, Genero genero, Biblioteca biblioteca, String status) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.classificacao = classificacao;
		this.editora = editora;
		this.codigo = codigo;
		this.genero = genero;
		this.biblioteca = biblioteca;
		this.status = status;
	}
	public Livro() {

	}

	
	
}
