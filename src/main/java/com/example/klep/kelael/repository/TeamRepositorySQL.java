package com.example.klep.kelael.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.klep.kelael.model.Team;

public interface TeamRepositorySQL extends CrudRepository<Team, String> {
    // Consultas personalizadas para equipos si es necesario
}
