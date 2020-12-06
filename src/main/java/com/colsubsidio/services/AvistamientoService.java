/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.Avistamiento;
import com.colsubsidio.entities.Persona;
import com.colsubsidio.repositories.AvistamientoRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;


@Service
public class AvistamientoService {
    @Autowired
	private AvistamientoRepository avistamientoRespository;

    public List<Avistamiento> findAll() {
        return avistamientoRespository.findAll();
    }

    public Optional<Avistamiento> findById(int id) {
        return avistamientoRespository.findById(id);
    }

    public Avistamiento save(Avistamiento stock) {
        return avistamientoRespository.save(stock);
    }

    public void deleteById(int id) {
    	avistamientoRespository.deleteById(id);
    }
}