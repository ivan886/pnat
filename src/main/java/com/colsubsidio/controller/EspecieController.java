package com.colsubsidio.controller;


import com.colsubsidio.entities.Especie;
import com.colsubsidio.services.EspecieService;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EspecieController {

    @Autowired
    private EspecieService especieService;

    @RequestMapping("/especies")
    public @ResponseBody
    Iterable<Especie> finddAll() {
        return especieService.findAll();
    }

    @PostMapping("/especies")
    public void save(@RequestBody Especie especie) {
        especieService.save(especie);
    }
    
    
 @RequestMapping("/especies/{id}")
    public Optional<Especie> findById(@PathVariable Integer id){
        return especieService.findById(id);
    }
    
}
