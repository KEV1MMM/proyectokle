package com.example.klep.kelael.model;
public class Card {
    private String id;
    private String jugadorId;
    private String tipo;  // Roja o Amarilla
    private String motivo;
    private String partidoId;

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getJugadorId() { return jugadorId; }
    public void setJugadorId(String jugadorId) { this.jugadorId = jugadorId; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public String getPartidoId() { return partidoId; }
    public void setPartidoId(String partidoId) { this.partidoId = partidoId; }
}

