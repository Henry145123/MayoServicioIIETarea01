package com.idat.MayoServicioTarea01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MayoServicioTarea01.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
