package com.residencia.biblioteca.dto;

import java.util.List;

public class EditoraResumidaDTO {

	private Integer codigoEditora;
	private String nome;
	private List<LivroResumidoDTO> listaLivroMinDto;

	public EditoraResumidaDTO() {

	}

	public EditoraResumidaDTO(Integer codigoEditora, String nome) {
		this.codigoEditora = codigoEditora;
		this.nome = nome;
	}

	public List<LivroResumidoDTO> getListaLivroMinDto() {
		return listaLivroMinDto;
	}

	public void setListaLivroMinDto(List<LivroResumidoDTO> listaLivroMinDto) {
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
