package com.residencia.biblioteca.dto;

import java.util.Date;

public class AlunoDTO {
	private Integer numeroMatriculaAluno;
	private String nome;
	private Date dataNascimento;
	private String CPF;
	private String logradouro;
	private String numeroLogradouro;
	private String complemento;
	private String bairro;
	private String cidade;
	
	public AlunoDTO() {
		super();
	}

	public AlunoDTO(Integer numeroMatriculaAluno, String nome, Date dataNascimento, String cPF, String logradouro,
			String numeroLogradouro, String complemento, String bairro, String cidade) {
		super();
		this.numeroMatriculaAluno = numeroMatriculaAluno;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		CPF = cPF;
		this.logradouro = logradouro;
		this.numeroLogradouro = numeroLogradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Integer getNumeroMatriculaAluno() {
		return numeroMatriculaAluno;
	}

	public void setNumeroMatriculaAluno(Integer numeroMatriculaAluno) {
		this.numeroMatriculaAluno = numeroMatriculaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
