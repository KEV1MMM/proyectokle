package com.example.klep.kelael.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.klep.kelael.model.Card;

public interface CardRepositoryMongo extends MongoRepository<Card, String> {
    // Consultas personalizadas para tarjetas (rojas, amarillas)
}
