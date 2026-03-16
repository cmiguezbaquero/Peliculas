package com.iesdeteis.peliculas.controller;

import com.iesdeteis.peliculas.model.Usuario;
import com.iesdeteis.peliculas.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")

    public List<Usuario> getGetUsuarios() {
        return usuarioService.findAll();
    }
}
