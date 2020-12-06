/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.repositories;

import com.colsubsidio.entities.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {
	
	public Persona findByNombre(String nombre);
	public Persona findByCodigoPersona(Long id);	
}