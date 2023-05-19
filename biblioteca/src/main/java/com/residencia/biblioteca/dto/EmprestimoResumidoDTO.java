package com.residencia.biblioteca.dto;

import java.util.Date;

public class EmprestimoResumidoDTO {

	private Date dataEmprestimo;
	private Date dataEntrega;
	private LivroResumidoDTO livroResumidoDTO;

	public EmprestimoResumidoDTO() {
	}

	public EmprestimoResumidoDTO(Date dataEmprestimo, Date dataEntrega) {
		this.dataEmprestimo = dataEmprestimo;
		this.dataEntrega = dataEntrega;
	}

	public EmprestimoResumidoDTO(Date dataEmprestimo, Date dataEntrega, LivroResumidoDTO livroResumidoDTO) {
		this.dataEmprestimo = dataEmprestimo;
		this.dataEntrega = dataEntrega;
		this.livroResumidoDTO = livroResumidoDTO;
	}

	public LivroResumidoDTO getLivroResumidoDTO() {
		return livroResumidoDTO;
	}

	public void setLivroResumidoDTO(LivroResumidoDTO livroResumidoDTO) {
		this.livroResumidoDTO = livroResumidoDTO;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

}
