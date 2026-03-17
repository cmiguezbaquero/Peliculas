package com.iesdeteis.peliculas.controller;

import com.iesdeteis.peliculas.model.Usuario;
import com.iesdeteis.peliculas.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")

    public List<Usuario> getGetUsuarios() {
        return usuarioService.findAll();
    }

    @GetMapping ("/usuarios/{id}")
    public Usuario getUsuarioById (@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping ("/usuarios/")
    public void saveUsuario(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

    @DeleteMapping("/usuarios/{id}")
    public void deleteUsuario (@PathVariable Long id){
        usuarioService.deleteById(id);
    }

    @PutMapping("/usuarios/{id}")
    public void updateUsuario(@RequestBody Usuario usuario) {
        usuarioService.save(usuario);
    }
}
