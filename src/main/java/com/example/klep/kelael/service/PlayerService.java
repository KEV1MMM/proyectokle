package com.example.klep.kelael.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.klep.kelael.model.Player;
import com.example.klep.kelael.repository.PlayerRepositorySQL;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepositorySQL playerRepo;

    public void mostrarJugadores() {
        System.out.println("--- Lista de Jugadores ---");
        Iterable<Player> jugadores = playerRepo.findAll();

        for (Player jugador : jugadores) {
            System.out.println("ID: " + jugador.getId() + ", Nombre: " + jugador.getNombre() + ", Equipo: " + jugador.getEquipoId());
        }
    }

    public void agregarJugador(Player jugador) {
        playerRepo.save(jugador);
    }

    public void eliminarJugador(String id) {
        playerRepo.deleteById(id);
    }
}
