/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.Persona;
import com.colsubsidio.repositories.PersonaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class PersonaService {
   @Autowired
    PersonaRepository personaRepository;
    
   public  Iterable<Persona> findAll() {
        return personaRepository.findAll();
    }

     public List<Persona> findAll1() {
        Iterable<Persona> it = personaRepository.findAll();
        ArrayList<Persona> personas = new ArrayList<Persona>();
        it.forEach(e -> personas.add(e));
        return personas;
    }
    public Optional<Persona>  findById(Integer codigoPersona) {
        return personaRepository.findById(codigoPersona);
    }
    public void save(Persona persona) {
    	 personaRepository.save(persona);
        
    }
   

}
