package com.example.klep.kelael.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.klep.kelael.model.Match;
import com.example.klep.kelael.repository.MatchRepositoryMongo;

@Service
public class MatchService {
    @Autowired
    private MatchRepositoryMongo matchRepository;

    public void mostrarPartidos() {
        List<Match> partidos = matchRepository.findAll();
        System.out.println("--- Lista de Partidos ---");
        for (Match partido : partidos) {
            System.out.println("ID: " + partido.getId() + ", Equipo Local ID: " + partido.getEquipoLocalId() + ", Equipo Visitante ID: " + partido.getEquipoVisitanteId() + ", Fecha: " + partido.getFecha());
        }
    }
}
