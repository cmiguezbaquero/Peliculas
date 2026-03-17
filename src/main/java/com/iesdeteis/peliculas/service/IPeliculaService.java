package com.iesdeteis.peliculas.service;

import com.iesdeteis.peliculas.model.Pelicula;


import java.util.List;

public interface IPeliculaService {
    public List<Pelicula> findAll();
    public Pelicula findById (Long id);
    public void save (Pelicula pelicula);
    public void deleteById (Long id);
}
