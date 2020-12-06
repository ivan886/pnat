package com.colsubsidio.controller;


import com.colsubsidio.entities.Avistamiento;
import com.colsubsidio.repositories.AvistamientoRepository;
import com.colsubsidio.services.UsuarioService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvistamientoController {

    @Autowired
    private AvistamientoRepository avistamientoRepository;

    @GetMapping("/avistamientos")
    public List<Avistamiento> getAvistamientos() {
    	return avistamientoRepository.findAll();
    }    
}
