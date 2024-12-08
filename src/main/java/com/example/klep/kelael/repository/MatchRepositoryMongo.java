package com.example.klep.kelael.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.klep.kelael.model.Match;

public interface MatchRepositoryMongo extends MongoRepository<Match, String> {
    // Consultas específicas para obtener partidos, etc.
}

