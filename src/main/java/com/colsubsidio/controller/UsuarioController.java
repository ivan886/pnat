package com.colsubsidio.controller;


import com.colsubsidio.entities.Usuario;
import com.colsubsidio.services.UsuarioService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("/usuarios")
    public @ResponseBody
    Iterable<Usuario> finddAll() {
        return usuarioService.findAll();
    }
    @PostMapping("/usuarios")
    public void save(@RequestBody Usuario usuario) {
        usuarioService.save(usuario);
    }
 @RequestMapping("/usuarios/{idUsuario}")
    public Optional<Usuario> findById(@PathVariable Integer idUsuario){
        return usuarioService.findById(idUsuario);
    }
    
}
