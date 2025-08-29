package com.ramazzotte.domain;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @ManyToOne
	private Livro livro;
	private OffsetDateTime datalocacao;
    @ManyToOne
	private Biblioteca biblio;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public OffsetDateTime getDatalocacao() {
		return datalocacao;
	}
	public void setDatalocacao(OffsetDateTime datalocacao) {
		this.datalocacao = datalocacao;
	}
	public Biblioteca getBiblio() {
		return biblio;
	}
	public void setBiblio(Biblioteca biblio) {
		this.biblio = biblio;
	}
	

}
