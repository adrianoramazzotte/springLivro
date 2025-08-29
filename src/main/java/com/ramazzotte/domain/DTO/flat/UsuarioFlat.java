package com.ramazzotte.domain.DTO.flat;

import java.time.OffsetDateTime;

public class UsuarioFlat {
	
	private Integer id;
	private String nome;
	private String telefone;
	private String email;
	private String senha;
	private String qrcode;
	private Integer idbiblioteca;
	private String nomebiblioteca;
	private Integer idendereco;
	private String numero;
	private String logradouro;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String complemento;
	private Integer idserie;
	private String  ano;
	private String turma;
	private String nomeserie;
	private String ra;
	private String cpf;
	private String tipo;
	private String documentoendereco;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getQrcode() {
		return qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public Integer getIdbiblioteca() {
		return idbiblioteca;
	}
	public void setIdbiblioteca(Integer idbiblioteca) {
		this.idbiblioteca = idbiblioteca;
	}
	public String getNomebiblioteca() {
		return nomebiblioteca;
	}
	public void setNomebiblioteca(String nomebiblioteca) {
		this.nomebiblioteca = nomebiblioteca;
	}
	public Integer getIdendereco() {
		return idendereco;
	}
	public void setIdendereco(Integer idendereco) {
		this.idendereco = idendereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Integer getIdserie() {
		return idserie;
	}
	public void setIdserie(Integer idserie) {
		this.idserie = idserie;
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
	public String getNomeserie() {
		return nomeserie;
	}
	public void setNomeserie(String nomeserie) {
		this.nomeserie = nomeserie;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDocumentoendereco() {
		return documentoendereco;
	}
	public void setDocumentoendereco(String documentoendereco) {
		this.documentoendereco = documentoendereco;
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
	public UsuarioFlat(Integer id, String nome, String telefone, String email, String senha, String qrcode,
			Integer idbiblioteca, String nomebiblioteca, Integer idendereco, String numero, String logradouro,
			String bairro, String cep, String cidade, String uf, String complemento, Integer idserie, String ano,
			String turma, String nomeserie, String ra, String cpf, String tipo, String documentoendereco,
			String usucriacao, OffsetDateTime datacriacao, String usualteracao, OffsetDateTime dataalteracao,
			String status) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.qrcode = qrcode;
		this.idbiblioteca = idbiblioteca;
		this.nomebiblioteca = nomebiblioteca;
		this.idendereco = idendereco;
		this.numero = numero;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.complemento = complemento;
		this.idserie = idserie;
		this.ano = ano;
		this.turma = turma;
		this.nomeserie = nomeserie;
		this.ra = ra;
		this.cpf = cpf;
		this.tipo = tipo;
		this.documentoendereco = documentoendereco;
		this.usucriacao = usucriacao;
		this.datacriacao = datacriacao;
		this.usualteracao = usualteracao;
		this.dataalteracao = dataalteracao;
		this.status = status;
	}
	public UsuarioFlat() {
	}

}
