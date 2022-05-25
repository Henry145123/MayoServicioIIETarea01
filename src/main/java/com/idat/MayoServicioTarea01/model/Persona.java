package com.idat.MayoServicioTarea01.model;

import javax.persistence.*;

@Table(name="Persona")
@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer idPersona;
	
	public String nombre;
	
	public String apellido;
	
	public String email;
	
	public Integer edad;

	public Persona(Integer idPersona, String nombre, String apellido, String email, Integer edad) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad = edad;
	}

	public Persona() {
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
	
}
