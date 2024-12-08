package com.example.klep.kelael.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.klep.kelael.model.Goal;

public interface GoalRepositoryMongo extends MongoRepository<Goal, String> {
    // Consultas para registrar y ver goles de partidos
}
