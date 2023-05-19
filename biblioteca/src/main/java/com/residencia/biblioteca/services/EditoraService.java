package com.residencia.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.dto.EditoraResumidaDTO;
import com.residencia.biblioteca.dto.LivroResumidoDTO;
import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.repositories.EditoraRepository;

@Service
public class EditoraService {

	@Autowired
	EditoraRepository editoraRepository;

	public List<Editora> getAllEditoras() {
		return editoraRepository.findAll();
	}

	public Editora getEditoraById(Integer id) {
		return editoraRepository.findById(id).orElse(null);
	}

	public EditoraResumidaDTO getEditoraDtoById(Integer id) {
		Editora editora = editoraRepository.findById(id).orElse(null);
		EditoraResumidaDTO editoraMinDTO = new EditoraResumidaDTO();

		if (editora == null)
			return null;

		editoraMinDTO.setCodigoEditora(editora.getCodigoEditora());
		editoraMinDTO.setNome(editora.getNome());

		List<LivroResumidoDTO> listaLivroMinDTO = new ArrayList<>();
		for (Livro livro : editora.getLivros()) {
			LivroResumidoDTO livroMinDTO = new LivroResumidoDTO();
			livroMinDTO.setNomeLivro(livro.getNomeLivro());
			livroMinDTO.setNomeAutor(livro.getNomeAutor());
			livroMinDTO.setDataLancamento(livro.getDataLancamento());
			listaLivroMinDTO.add(livroMinDTO);
		}

		editoraMinDTO.setListaLivroMinDto(listaLivroMinDTO);
		return editoraMinDTO;

	}

	public Editora saveEditora(Editora editora) {
		return editoraRepository.save(editora);
	}

	public Editora updateEditora(Editora editora, Integer id) {
		return editoraRepository.save(editora);
	}

	public Boolean deleteEditora(Integer id) {
		editoraRepository.deleteById(id);
		Editora editoraDeletada = editoraRepository.findById(id).orElse(null);
		if (editoraDeletada == null) {
			return true;
		} else {
			return false;
		}
	}
}
