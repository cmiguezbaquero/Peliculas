package com.iesdeteis.peliculas.repository;

import com.iesdeteis.peliculas.model.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaRepository extends CrudRepository <Pelicula, Long> {
}
