package com.julian.soporte.primerspring.repository;

import com.julian.soporte.primerspring.modelo.Planetas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanetRepository extends MongoRepository<Planetas, Integer> {



}
