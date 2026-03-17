package com.iesdeteis.peliculas.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    private String titulo;
    private Date año;
    private String genero;

    public Pelicula(Long id, String titulo, Date año, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.genero = genero;
    }

    public Pelicula(String titulo, Date año, String genero) {
        this.titulo = titulo;
        this.año = año;
        this.genero = genero;
    }

    public Pelicula(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Peliculas [id= " + id + "titulo= " + titulo + "]";
    }
}
