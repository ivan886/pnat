/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.repositories;

import com.colsubsidio.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Persona, Integer> {
	
	public Persona findByNombre(String nombre);
	public Persona findByCodigoPersona(Long id);	
}