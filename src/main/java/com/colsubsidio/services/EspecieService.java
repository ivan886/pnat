/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.Especie;
import com.colsubsidio.repositories.EspecieRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EspecieService {
    @Autowired
	private EspecieRepository especieRespository;

    public List<Especie> findAll() {
        return especieRespository.findAll();
    }

    public Optional<Especie> findById(int id) {
        return especieRespository.findById(id);
    }

    public Especie save(Especie especie) {
        return especieRespository.save(especie);
    }

    public void deleteById(int id) {
    	especieRespository.deleteById(id);
    }
}