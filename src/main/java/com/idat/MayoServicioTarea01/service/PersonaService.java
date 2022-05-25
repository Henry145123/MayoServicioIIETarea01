package com.idat.MayoServicioTarea01.service;

import java.util.List;


import com.idat.MayoServicioTarea01.model.Persona;

public interface PersonaService {

	void guardarPersona(Persona p);
	void actualizarPersona(Persona p);
	void eliminarPersona(Integer id);
	List<Persona> listaPersonas();
	Persona obtenerPersonaId(Integer id);
}
