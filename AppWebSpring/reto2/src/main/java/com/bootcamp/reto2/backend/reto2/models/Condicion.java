package com.bootcamp.reto2.backend.reto2.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Condicion")
public class Condicion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCondicion")
    private Long idCondicion;
    @Column(name = "DESCCONDICION", nullable = false)
    private String descCondicion;
    @Column(name = "FECHAREGISTRO")
    private LocalDate fechaRegistro;

    public Condicion() {

    }
    // Getters y Setters
    public Long getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(Long idCondicion) {
        this.idCondicion = idCondicion;
    }

    public String getDescCondicion() {
        return descCondicion;
    }

    public void setDescCondicion(String descCondicion) {
        this.descCondicion = descCondicion;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
