package com.idat.MayoServicioTarea01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioTarea01.model.Persona;
import com.idat.MayoServicioTarea01.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	
	@Autowired
	private PersonaRepository personRep;

	@Override
	public void guardarPersona(Persona p) {
		// TODO Auto-generated method stub
		personRep.save(p);
	}

	@Override
	public void actualizarPersona(Persona p) {
		// TODO Auto-generated method stub
		personRep.save(p);
	}

	@Override
	public void eliminarPersona(Integer id) {
		// TODO Auto-generated method stub
		personRep.deleteById(id);
	}

	@Override
	public List<Persona> listaPersonas() {
		// TODO Auto-generated method stub
		return personRep.findAll();
	}

	@Override
	public Persona obtenerPersonaId(Integer id) {
		// TODO Auto-generated method stub
		return personRep.findById(id).orElse(null);
	}
	
	
}
