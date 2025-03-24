package com.bootcamp.reto2.backend.reto2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "distrito")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDistrito")
    private Long idDistrito;
    @Column(name = "IDPROVINCIA")
    private Long idProvincia;
    @Column(name = "DESCDISTRITO")
    private String descDistrito;
    @Column(name = "FECHAREGISTRO")
    private java.sql.Date fechaRegistro;

    public Distrito(){

    }

    public Long getIdDistrito() {
        return idDistrito;
    }
    public void setIdDistrito(Long idDistrito) {
        this.idDistrito = idDistrito;
    }
    public Long getIdProvincia() {
        return idProvincia;
    }
    public void setIdProvincia(Long idProvincia) {
        this.idProvincia = idProvincia;
    }
    public String getDescDistrito() {
        return descDistrito;
    }
    public void setDescDistrito(String descDistrito) {
        this.descDistrito = descDistrito;
    }
    public java.sql.Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(java.sql.Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
}
