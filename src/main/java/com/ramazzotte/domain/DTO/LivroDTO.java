package com.ramazzotte.domain.DTO;

import java.time.OffsetDateTime;
import java.util.Date;

import com.ramazzotte.domain.Biblioteca;
import com.ramazzotte.domain.Editora;
import com.ramazzotte.domain.Genero;
import com.ramazzotte.validation.livro.LivroUpdate;
@LivroUpdate
public class LivroDTO {
	private Integer id;
	private String titulo;
	private String autor;
	private String ano;
	private String classificacao;
	private Editora editora;
	private String codigo;
	private Date dataCadastro;
	private Genero genero;
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
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
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LivroDTO(Integer id, String titulo, String autor, String ano, String classificacao, Editora editora,
			String codigo, Date dataCadastro, Genero genero, Biblioteca biblioteca, String usucriacao,
			OffsetDateTime datacriacao, String usualteracao, OffsetDateTime dataalteracao, String status) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.classificacao = classificacao;
		this.editora = editora;
		this.codigo = codigo;
		this.dataCadastro = dataCadastro;
		this.genero = genero;
		this.biblioteca = biblioteca;
		this.usucriacao = usucriacao;
		this.datacriacao = datacriacao;
		this.usualteracao = usualteracao;
		this.dataalteracao = dataalteracao;
		this.status = status;
	}
	public LivroDTO() {
		super();
	}
	
	
}
