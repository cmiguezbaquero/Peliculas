package com.iesdeteis.peliculas.service;

import com.iesdeteis.peliculas.model.Pelicula;
import com.iesdeteis.peliculas.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService implements IPeliculaService{

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> findAll() {
        return (List<Pelicula>) peliculaRepository.findAll();
    }

    @Override
    public Pelicula findById(Long id) {
        return peliculaRepository.findById(id).orElse(null);
    }


    @Override
    public void save(Pelicula pelicula) {
        peliculaRepository.save(pelicula);

    }

    @Override
    public void deleteById(Long id) {
        peliculaRepository.deleteById(id);
    }

}
