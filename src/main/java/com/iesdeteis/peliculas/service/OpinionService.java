package com.iesdeteis.peliculas.service;

import com.iesdeteis.peliculas.model.Opinion;
import com.iesdeteis.peliculas.repository.OpinionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OpinionService implements IOpinionService{

    @Autowired
    private OpinionRepository opinionRepository;

    @Override
    public List<Opinion> findAll() {
        return (List<Opinion>) opinionRepository.findAll();
    }

    @Override
    public Opinion findById(Long id) {
        return opinionRepository.findById(id).orElse(null);
    }


    @Override
    public void save(Opinion opinion) {
        opinionRepository.save(opinion);
    }

    @Override
    public void deleteById(Long id) {
        opinionRepository.deleteById(id);
    }

}
