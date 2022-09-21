package com.julian.soporte.primerspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julian.soporte.primerspring.modelo.Usuarios;
import com.julian.soporte.primerspring.repository.UsuarioRepository;

@RestController
@RequestMapping(value="/index/")
public class UsuarioController {
	
	private final UsuarioRepository userRepository;
	
	@Autowired
	public UsuarioController(UsuarioRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/usuarios")
	public List<Usuarios> getUsuarios(){
		return userRepository.findAll();
	}
	
}
