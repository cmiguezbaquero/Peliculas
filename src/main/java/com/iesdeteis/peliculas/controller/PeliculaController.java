package com.iesdeteis.peliculas.controller;

import com.iesdeteis.peliculas.model.Pelicula;
import com.iesdeteis.peliculas.service.IPeliculaService;
import com.iesdeteis.peliculas.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeliculaController {

    @Autowired
    private IPeliculaService peliculaService;

    @GetMapping("/peliculas")

    public List<Pelicula> getGetPeliculas() {
        return peliculaService.findAll();
    }

    @GetMapping ("/peliculas/{id}")
    public Pelicula getPeliculaById (@PathVariable Long id){
        return peliculaService.findById(id);
    }

    @PostMapping("/peliculas/")
    public void savePelicula(@RequestBody Pelicula pelicula){
        peliculaService.save(pelicula);
    }

    @DeleteMapping("/peliculas/{id}")
    public void deletePelicula (@PathVariable Long id){
        peliculaService.deleteById(id);
    }

    @PutMapping("/peliculas/{id}")
    public void updatePelicula(@RequestBody Pelicula pelicula) {
        peliculaService.save(pelicula);
    }
}
