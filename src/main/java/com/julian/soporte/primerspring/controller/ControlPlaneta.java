package com.julian.soporte.primerspring.controller;

import com.julian.soporte.primerspring.modelo.Planetas;
import com.julian.soporte.primerspring.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/index/")
//@CrossOrigin("*")
//@CrossOrigin(origins="http://localhost:8081")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControlPlaneta {

    
    private final PlanetRepository planetRepository;
    
    @Autowired
    public ControlPlaneta(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @GetMapping(value = "/all")
    public List<Planetas> getAll(){
        return planetRepository.findAll();
    }

    @PostMapping(value = "/planetas")
    Planetas newPlanet(@RequestBody Planetas planeta){
        return planetRepository.save(planeta);
    }

}
