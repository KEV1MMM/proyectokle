package com.example.klep.kelael.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "goals")
public class Goal {

    @Id
    private String id;
    private String jugadorId;
    private String partidoId;
    private int minuto;

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getJugadorId() { return jugadorId; }
    public void setJugadorId(String jugadorId) { this.jugadorId = jugadorId; }

    public String getPartidoId() { return partidoId; }
    public void setPartidoId(String partidoId) { this.partidoId = partidoId; }

    public int getMinuto() { return minuto; }
    public void setMinuto(int minuto) { this.minuto = minuto; }
}
