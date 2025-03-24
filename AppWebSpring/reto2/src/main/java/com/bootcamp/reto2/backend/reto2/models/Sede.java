package com.bootcamp.reto2.backend.reto2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sede")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSede")
    private long idSede;
    @Column(name = "DESCSEDE")
    private String descSede;
    @Column(name = "FECHAREGISTRO")
    private java.sql.Date fechaRegistro;

    
    public Sede() {
    }

    public long getIdSede() {
        return idSede;
    }
    public void setIdSede(long idSede) {
        this.idSede = idSede;
    }
    public String getDescSede() {
        return descSede;
    }
    public void setDescSede(String descSede) {
        this.descSede = descSede;
    }
    public java.sql.Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(java.sql.Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
}
