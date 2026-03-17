package com.iesdeteis.peliculas.controller;


import com.iesdeteis.peliculas.model.Opinion;
import com.iesdeteis.peliculas.service.IOpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/opiniones")
public class OpinionController {

    @Autowired
    private IOpinionService opinionService;

    @GetMapping
    public List<Opinion> getOpiniones() {
        return opinionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Opinion> getOpinionById(@PathVariable Long id) {
        Opinion opinion = opinionService.findById(id);
        if (opinion == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(opinion);
    }

    @PostMapping
    public ResponseEntity<Opinion> saveOpinion(@RequestBody Opinion opinion) {
        opinionService.save(opinion);
        return ResponseEntity.status(HttpStatus.CREATED).body(opinion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOpinion(@PathVariable Long id) {
        opinionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Opinion> updateOpinion(@PathVariable Long id, @RequestBody Opinion opinion) {
        opinion.setId(id);
        opinionService.save(opinion);
        return ResponseEntity.ok(opinion);
    }
}
