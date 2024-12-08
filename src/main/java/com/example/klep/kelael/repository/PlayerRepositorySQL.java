package com.example.klep.kelael.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.klep.kelael.model.Player;

public interface PlayerRepositorySQL extends CrudRepository<Player, String> {
    // Puedes agregar métodos personalizados aquí si lo necesitas
}
