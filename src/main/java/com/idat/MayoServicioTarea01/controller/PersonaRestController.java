package com.idat.MayoServicioTarea01.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.idat.MayoServicioTarea01.service.PersonaService;

import com.idat.MayoServicioTarea01.model.Persona;


@RestController
@RequestMapping("/persona/v1")
public class PersonaRestController {

	@Autowired
	private PersonaService personSer;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Persona>>  listar(){
		
		 return new ResponseEntity<List<Persona>>( personSer.listaPersonas(),HttpStatus.OK);
	}
	
	@RequestMapping(path="/guardar",method=RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Persona persona) {
		personSer.guardarPersona(persona);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/borrar/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Persona p = personSer.obtenerPersonaId(id);
		if(p!=null) {
			personSer.eliminarPersona(id);
			return new ResponseEntity<Void>(HttpStatus.OK); 
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path="/buscar/{id}",method=RequestMethod.GET)
	public ResponseEntity<Persona> buscarPorId(@PathVariable Integer id){
		Persona p =personSer.obtenerPersonaId(id);
		if(p!=null) {
			return new ResponseEntity<Persona>(p,HttpStatus.OK);
		}
		return new ResponseEntity<Persona>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path="/editar",method=RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody Persona p){
		
		Persona per=personSer.obtenerPersonaId(p.getIdPersona());		
		if(per!=null) {
			personSer.actualizarPersona(p);
			return new ResponseEntity<Void>(HttpStatus.OK); 
		}		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
}
