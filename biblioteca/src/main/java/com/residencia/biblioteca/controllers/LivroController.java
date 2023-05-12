package com.residencia.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.biblioteca.entities.Livro;
import com.residencia.biblioteca.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	LivroService livroService;

	@GetMapping
	public ResponseEntity<List<Livro>> getAllLivros() {
		return new ResponseEntity<>(livroService.getAllLivros(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Livro> getLivroById(Integer id) {
		Livro livroResponse = livroService.getLivroById(id);

		if (null == livroResponse) {

			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

		} else {

			return new ResponseEntity<>(livroService.getLivroById(id), HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Livro> saveLivro(Livro livro) {
		Livro livroResponse = livroService.saveLivro(livro);
		if (livroResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(livroResponse, HttpStatus.OK);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Livro> updateLivro(Livro livro, Integer id) {
		Livro livroResponse = livroService.updateLivro(livro, id);
		if (livroResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(livroResponse, HttpStatus.OK);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteLivro(Integer id) {

		Boolean livroResponse = livroService.deleteLivro(id);

		if (livroResponse == false) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(livroResponse, HttpStatus.OK);
		}
	}
}
