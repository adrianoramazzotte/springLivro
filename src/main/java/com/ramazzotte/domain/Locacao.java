package com.ramazzotte.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Locacao implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private OffsetDateTime datalocacao;
	private OffsetDateTime datadevolucao;
	@ManyToOne
	private Livro livro;
	private BigDecimal multadiaria;
	private BigDecimal valorLivro;
	@ManyToOne
	private Usuario funcionario;
	@ManyToOne
	private Usuario cliente;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public OffsetDateTime getDatalocacao() {
		return datalocacao;
	}
	public void setDatalocacao(OffsetDateTime datalocacao) {
		this.datalocacao = datalocacao;
	}
	public OffsetDateTime getDatadevolucao() {
		return datadevolucao;
	}
	public void setDatadevolucao(OffsetDateTime datadevolucao) {
		this.datadevolucao = datadevolucao;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public BigDecimal getMultadiaria() {
		return multadiaria;
	}
	public void setMultadiaria(BigDecimal multadiaria) {
		this.multadiaria = multadiaria;
	}
	public BigDecimal getValorLivro() {
		return valorLivro;
	}
	public void setValorLivro(BigDecimal valorLivro) {
		this.valorLivro = valorLivro;
	}
	public Usuario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Usuario funcionario) {
		this.funcionario = funcionario;
	}
	public Usuario getCliente() {
		return cliente;
	}
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	
	public Locacao() {
		super();
	}
	public Locacao(Integer id, OffsetDateTime datalocacao, OffsetDateTime datadevolucao, Livro livro,
			BigDecimal multadiaria, BigDecimal valorLivro, Usuario funcionario, Usuario cliente) {
		super();
		this.id = id;
		this.datalocacao = datalocacao;
		this.datadevolucao = datadevolucao;
		this.livro = livro;
		this.multadiaria = multadiaria;
		this.valorLivro = valorLivro;
		this.funcionario = funcionario;
		this.cliente = cliente;
	}

}
