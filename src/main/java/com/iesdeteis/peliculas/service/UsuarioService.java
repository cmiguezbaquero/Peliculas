package com.iesdeteis.peliculas.service;

import com.iesdeteis.peliculas.model.Usuario;
import com.iesdeteis.peliculas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;



    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return null;
    }

    @Override
    public void save(String nombre, String mail) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
