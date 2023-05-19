package com.residencia.biblioteca.dto;

import java.util.List;

public class AlunoResumidoDTO {

	private String nome;
	private String cpf;
	private List<EmprestimoResumidoDTO> listaEmprestimoResumidoDTO;

	public AlunoResumidoDTO() {
		super();
	}

	public AlunoResumidoDTO(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public AlunoResumidoDTO(String nome, String cpf, List<EmprestimoResumidoDTO> listaEmprestimoResumidoDTO) {
		this.nome = nome;
		this.cpf = cpf;
		this.listaEmprestimoResumidoDTO = listaEmprestimoResumidoDTO;
	}

	public List<EmprestimoResumidoDTO> getListaEmprestimoResumidoDTO() {
		return listaEmprestimoResumidoDTO;
	}

	public void setListaEmprestimoResumidoDTO(List<EmprestimoResumidoDTO> listaEmprestimoResumidoDTO) {
		this.listaEmprestimoResumidoDTO = listaEmprestimoResumidoDTO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
