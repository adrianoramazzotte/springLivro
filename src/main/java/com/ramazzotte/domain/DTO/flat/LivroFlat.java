package com.ramazzotte.domain.DTO.flat;

import java.time.OffsetDateTime;
import java.util.Date;

public class LivroFlat {
	
	private Integer id;
	private String titulo;
	private String autor;
	private String ano;
	private String classificacao;
	private Integer ideditora;
	private String razao;
	private String telefone;
	private String usucriacao;
	private OffsetDateTime datacriacao;
	private String usualteracao;
	private OffsetDateTime dataalteracao;
	private String email;
	private String cpfoucnpjnpj;
	private String codigo;	
	private Date dataCadastro;
	private Integer idgenero;
	private String nome;
	private Integer idBiblioteca;
	private String nomebiblioteca;
	private Integer idendereco;
	private String numero;
	private String logradouro;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String complemento;
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
	public Integer getIdeditora() {
		return ideditora;
	}
	public void setIdeditora(Integer ideditora) {
		this.ideditora = ideditora;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpfoucnpjnpj() {
		return cpfoucnpjnpj;
	}
	public void setCpfoucnpjnpj(String cpfoucnpjnpj) {
		this.cpfoucnpjnpj = cpfoucnpjnpj;
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
	public Integer getIdgenero() {
		return idgenero;
	}
	public void setIdgenero(Integer idgenero) {
		this.idgenero = idgenero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdBiblioteca() {
		return idBiblioteca;
	}
	public void setIdBiblioteca(Integer idBiblioteca) {
		this.idBiblioteca = idBiblioteca;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LivroFlat(Integer id, String titulo, String autor, String ano, String classificacao, Integer ideditora,
			String razao, String telefone, String usucriacao, OffsetDateTime datacriacao, String usualteracao,
			OffsetDateTime dataalteracao, String email, String cpfoucnpjnpj, String codigo, Date dataCadastro,
			Integer idgenero, String nome, Integer idBiblioteca, String nomebiblioteca, Integer idendereco,
			String numero, String logradouro, String bairro, String cep, String cidade, String uf, String complemento,
			String status) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.classificacao = classificacao;
		this.ideditora = ideditora;
		this.razao = razao;
		this.telefone = telefone;
		this.usucriacao = usucriacao;
		this.datacriacao = datacriacao;
		this.usualteracao = usualteracao;
		this.dataalteracao = dataalteracao;
		this.email = email;
		this.cpfoucnpjnpj = cpfoucnpjnpj;
		this.codigo = codigo;
		this.dataCadastro = dataCadastro;
		this.idgenero = idgenero;
		this.nome = nome;
		this.idBiblioteca = idBiblioteca;
		this.nomebiblioteca = nomebiblioteca;
		this.idendereco = idendereco;
		this.numero = numero;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.complemento = complemento;
		this.status = status;
	}
	public LivroFlat() {
		super();
	}

}
