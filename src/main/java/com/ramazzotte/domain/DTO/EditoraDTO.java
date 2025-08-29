package com.ramazzotte.domain.DTO;

import java.time.OffsetDateTime;

import com.ramazzotte.validation.editora.EditoraUpdate;
@EditoraUpdate
public class EditoraDTO {
	private Integer id;
	private String razao;
	private String telefone;
	private String usucriacao;
	private OffsetDateTime datacriacao;
	private String usualteracao;
	private OffsetDateTime dataalteracao;
	private String email;
	private String cpfoucnpjnpj;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public EditoraDTO(Integer id, String razao, String telefone, String usucriacao, OffsetDateTime datacriacao,
			String usualteracao, OffsetDateTime dataalteracao, String email, String cpfoucnpjnpj) {
		super();
		this.id = id;
		this.razao = razao;
		this.telefone = telefone;
		this.usucriacao = usucriacao;
		this.datacriacao = datacriacao;
		this.usualteracao = usualteracao;
		this.dataalteracao = dataalteracao;
		this.email = email;
		this.cpfoucnpjnpj = cpfoucnpjnpj;
	}


	public EditoraDTO() {
		super();
	}
	
	
	
}
