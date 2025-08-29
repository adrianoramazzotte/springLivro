package com.ramazzotte.domain.DTO;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.ramazzotte.domain.Livro;
import com.ramazzotte.domain.Usuario;
import com.ramazzotte.validation.locacao.LocacaoUpdate;
@LocacaoUpdate
public class LocacaoDTO {
	private Integer id;
	private OffsetDateTime datalocacao;
	private OffsetDateTime datadevolucao;
	private Livro livro;
	private BigDecimal multadiaria;
	private BigDecimal valorLivro;
	private Usuario funcionario;
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
	public LocacaoDTO(Integer id, OffsetDateTime datalocacao, OffsetDateTime datadevolucao, Livro livro,
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
	public LocacaoDTO() {
		super();
	}
	
	
}
