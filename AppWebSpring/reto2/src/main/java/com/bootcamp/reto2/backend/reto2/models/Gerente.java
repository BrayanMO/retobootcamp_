package com.bootcamp.reto2.backend.reto2.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Gerente")
public class Gerente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGerente")
    private Long idGerente;

    @Column(name = "DESCGERENTE", nullable = false) // Asegúrate de que coincida con la columna en la base de datos
    private String descGerente;

    @Column(name = "FECHAREGISTRO") // Asegúrate de que coincida con la columna en la base de datos
    private java.sql.Date fechaRegistro;

    // Getters y Setters
    public Long getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(Long idGerente) {
        this.idGerente = idGerente;
    }

    public String getDescGerente() {
        return descGerente;
    }

    public void setDescGerente(String descGerente) {
        this.descGerente = descGerente;
    }

    public java.sql.Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(java.sql.Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // Sobrescribir el método toString()
    @Override
    public String toString() {
        return "Gerente{" +
                "idGerente=" + idGerente +
                ", descGerente='" + descGerente + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}
