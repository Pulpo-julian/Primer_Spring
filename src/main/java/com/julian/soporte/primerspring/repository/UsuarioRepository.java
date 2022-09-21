package com.julian.soporte.primerspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.julian.soporte.primerspring.modelo.Usuarios;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuarios, String>{
		

}
