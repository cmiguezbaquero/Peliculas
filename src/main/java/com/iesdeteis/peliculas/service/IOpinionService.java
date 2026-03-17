package com.iesdeteis.peliculas.service;

import com.iesdeteis.peliculas.model.Opinion;

import java.util.List;

public interface IOpinionService {

    public List<Opinion> findAll();
    public Opinion findById (Long id);
    public void save (Opinion opinion);
    public void deleteById (Long id);
}
