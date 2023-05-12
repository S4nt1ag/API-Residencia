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

import com.residencia.biblioteca.entities.Usuario;
import com.residencia.biblioteca.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping
	public ResponseEntity<List<Usuario>> getAllUsuarios() {
		return new ResponseEntity<>(usuarioService.getAllUsuarios(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getUsuarioById(Integer id) {
		Usuario usuarioResponse = usuarioService.getUsuarioById(id);

		if (null == usuarioResponse) {

			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

		} else {

			return new ResponseEntity<>(usuarioService.getUsuarioById(id), HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Usuario> saveUsuario(Usuario usuario) {
		Usuario usuarioResponse = usuarioService.saveUsuario(usuario);
		if (usuarioResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(usuarioResponse, HttpStatus.OK);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Usuario> updateUsuario(Usuario usuario, Integer id) {
		Usuario usuarioResponse = usuarioService.updateUsuario(usuario, id);
		if (usuarioResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(usuarioResponse, HttpStatus.OK);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteUsuario(Integer id) {

		Boolean usuarioResponse = usuarioService.deleteUsuario(id);

		if (usuarioResponse == false) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(usuarioResponse, HttpStatus.OK);
		}
	}
}
