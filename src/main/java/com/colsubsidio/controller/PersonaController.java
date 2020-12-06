package com.colsubsidio.controller;


import com.colsubsidio.entities.Persona;
import com.colsubsidio.services.PersonaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping("/personas")
    public @ResponseBody
    Iterable<Persona> finddAll() {
        return personaService.findAll1();
    }

    @PostMapping("/personas")
    public void save(@RequestBody Persona persona) {
        personaService.save(persona);
    }
 @RequestMapping("/personas/{codigoPersona}")
    public Optional<Persona> findById(@PathVariable Integer codigoPersona){
        System.out.println(codigoPersona);
        return personaService.findById(codigoPersona);
    }
    
}
