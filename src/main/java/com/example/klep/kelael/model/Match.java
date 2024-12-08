package com.example.klep.kelael.model;

import java.time.LocalDate;

public class Match {
    private String id;
    private String equipoLocalId;
    private String equipoVisitanteId;
    private LocalDate fecha;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getEquipoLocalId() { return equipoLocalId; }
    public void setEquipoLocalId(String equipoLocalId) { this.equipoLocalId = equipoLocalId; }
    public String getEquipoVisitanteId() { return equipoVisitanteId; }
    public void setEquipoVisitanteId(String equipoVisitanteId) { this.equipoVisitanteId = equipoVisitanteId; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public int getGolesEquipoLocal() { return golesEquipoLocal; }
    public void setGolesEquipoLocal(int golesEquipoLocal) { this.golesEquipoLocal = golesEquipoLocal; }
    public int getGolesEquipoVisitante() { return golesEquipoVisitante; }
    public void setGolesEquipoVisitante(int golesEquipoVisitante) { this.golesEquipoVisitante = golesEquipoVisitante; }
}
