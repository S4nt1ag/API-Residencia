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

import com.residencia.biblioteca.entities.Editora;
import com.residencia.biblioteca.services.EditoraService;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

	@Autowired
	EditoraService editoraService;

	@GetMapping
	public ResponseEntity<List<Editora>> getAllEditoras() {
		return new ResponseEntity<>(editoraService.getAllEditoras(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Editora> getEditoraById(Integer id) {
		Editora editoraResponse = editoraService.getEditoraById(id);

		if (null == editoraResponse) {

			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

		} else {

			return new ResponseEntity<>(editoraService.getEditoraById(id), HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Editora> saveEditora(Editora editora) {
		Editora editoraResponse = editoraService.saveEditora(editora);
		if (editoraResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(editoraResponse, HttpStatus.OK);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Editora> updateEditora(Editora editora, Integer id) {
		Editora editoraResponse = editoraService.updateEditora(editora, id);
		if (editoraResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(editoraResponse, HttpStatus.OK);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteEditora(Integer id) {

		Boolean editoraResponse = editoraService.deleteEditora(id);

		if (editoraResponse == false) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(editoraResponse, HttpStatus.OK);
		}
	}
}
