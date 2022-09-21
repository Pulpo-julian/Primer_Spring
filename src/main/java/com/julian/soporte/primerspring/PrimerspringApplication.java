package com.julian.soporte.primerspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.julian.soporte.primerspring.modelo.Usuarios;
import com.julian.soporte.primerspring.repository.UsuarioRepository;

@SpringBootApplication
public class PrimerspringApplication implements CommandLineRunner{
	
	private final UsuarioRepository userRepository;
	
	@Autowired
	public PrimerspringApplication(UsuarioRepository userRepository) {
		this.userRepository =  userRepository;
	}

	public static void main(String[] args) {

		SpringApplication.run(PrimerspringApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		if(userRepository.findAll().isEmpty()) {
			userRepository.save(new Usuarios("Julian", "regalado"));
			userRepository.save(new Usuarios("Juan", "Sanchez"));
		}
		
		for(Usuarios usuario: userRepository.findAll()) {
			System.out.println(usuario);
		}
		
		
	}

}
