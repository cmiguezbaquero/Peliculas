package com.iesdeteis.peliculas.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "opiniones")
public class Opinion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long usuario_id;
    private Long pelicula_id;
    private int puntuacion;
    private String comentario;
    private LocalDate creado_en;


    public Opinion() {}

    public Opinion(Long id, Long usuario_id, Long pelicula_id, int puntuacion, String comentario, LocalDate creado_en) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.pelicula_id = pelicula_id;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.creado_en = creado_en;
    }

    public Opinion(Long usuario_id, Long pelicula_id, int puntuacion, String comentario, LocalDate creado_en) {
        this.usuario_id = usuario_id;
        this.pelicula_id = pelicula_id;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.creado_en = creado_en;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Long getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(Long pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getCreado_en() {
        return creado_en;
    }

    public void setCreado_en(LocalDate creado_en) {
        this.creado_en = creado_en;
    }

    @Override
    public String toString() {
        return "Opiniones [id= " + id + "puntuacion= " + puntuacion + "]";
    }
}
