package com.julian.soporte.primerspring.modelo;


import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Data
@Document
public class Usuarios {
	
	@Id
	private String id;
	
	@Field
	private String nombres;
	
	@Field 
	private String apellidos;
	
	//constructors
	public Usuarios() {
		
	}
	
	public Usuarios(String nombres, String apellidos) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
	}



	//get set
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return String.format("Usuario[id='%s', nombres='%s', apellidos='%s']", id, nombres, apellidos);
	}
	
	
	
	
	

}
