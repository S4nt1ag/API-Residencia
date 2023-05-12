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

import com.residencia.biblioteca.entities.Emprestimo;
import com.residencia.biblioteca.services.EmprestimoService;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

	@Autowired
	EmprestimoService emprestimoService;

	@GetMapping
	public ResponseEntity<List<Emprestimo>> getAllEmprestimos() {
		return new ResponseEntity<>(emprestimoService.getAllEmprestimos(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Emprestimo> getEmprestimoById(Integer id) {
		Emprestimo emprestimoResponse = emprestimoService.getEmprestimoById(id);

		if (null == emprestimoResponse) {

			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

		} else {

			return new ResponseEntity<>(emprestimoService.getEmprestimoById(id), HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Emprestimo> saveEmprestimo(Emprestimo emprestimo) {
		Emprestimo emprestimoResponse = emprestimoService.saveEmprestimo(emprestimo);
		if (emprestimoResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(emprestimoResponse, HttpStatus.OK);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Emprestimo> updateEmprestimo(Emprestimo emprestimo, Integer id) {
		Emprestimo emprestimoResponse = emprestimoService.updateEmprestimo(emprestimo, id);
		if (emprestimoResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(emprestimoResponse, HttpStatus.OK);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteEmprestimo(Integer id) {

		Boolean emprestimoResponse = emprestimoService.deleteEmprestimo(id);

		if (emprestimoResponse == false) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(emprestimoResponse, HttpStatus.OK);
		}
	}
}
