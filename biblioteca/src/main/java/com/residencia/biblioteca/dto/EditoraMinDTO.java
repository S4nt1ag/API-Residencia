package com.residencia.biblioteca.dto;

import java.util.List;

public class EditoraMinDTO {

	private Integer codigoEditora;
	private String nome;
	private List<LivroMinDTO> listaLivroMinDto;

	public EditoraMinDTO() {

	}

	public EditoraMinDTO(Integer codigoEditora, String nome) {
		this.codigoEditora = codigoEditora;
		this.nome = nome;
	}

	public List<LivroMinDTO> getListaLivroMinDto() {
		return listaLivroMinDto;
	}

	public void setListaLivroMinDto(List<LivroMinDTO> listaLivroMinDto) {
		this.listaLivroMinDto = listaLivroMinDto;
	}

	public Integer getCodigoEditora() {
		return codigoEditora;
	}

	public void setCodigoEditora(Integer codigoEditora) {
		this.codigoEditora = codigoEditora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
