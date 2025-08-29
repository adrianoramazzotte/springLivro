package com.ramazzotte.domain;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String telefone;
	private String email;
	@JsonIgnore
	private String senha;
	private String qrcode;
	@ManyToOne
	private Biblioteca biblio;
	@ManyToOne
	private Serie serie;
	@ManyToOne
	private Escola escola;
	private String ra;
	private String cpf;
	private String tipo;
	private String latitude;
	private String longitude;
	@OneToOne
	private Endereco endereco;
	
	private String documentoendereco;
	private String usucriacao;
	private OffsetDateTime datacriacao;
	private String usualteracao;
	private OffsetDateTime dataalteracao;
	private String status;
	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuario_permissao", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_permissao"))
	private Set<Permissao> permissoes = new HashSet<>();
	public Integer getId() {
		return id;
	}
	
	public Serie getSerie() {
		return serie;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}



	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Set<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(Set<Permissao> permissoes) {
		this.permissoes = permissoes;
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
	public Biblioteca getBiblio() {
		return biblio;
	}
	public void setBiblio(Biblioteca biblio) {
		this.biblio = biblio;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Usuario(Integer id, String nome, String telefone, String email, String senha, String qrcode,
			Biblioteca biblio, String ra, String cpf, String tipo, String documentoendereco, String status) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.qrcode = qrcode;
		this.biblio = biblio;
		this.ra = ra;
		this.cpf = cpf;
		this.tipo = tipo;
		this.documentoendereco = documentoendereco;
		this.status = status;
	}
	public Usuario() {
		super();
	}
	
	

}
