package com.bootcamp.reto2.backend.reto2.dto;

import java.sql.Date;

public class HospitalDTO {
    private Long idHospital;
    private Long idDistrito;
    private String nombre;
    private Long antiguedad;
    private Double area;
    private Long idSede;
    private Long idGerente;
    private Long idCondicion;
    private java.sql.Date fechaRegistro;
    
    

    public HospitalDTO(Long idHospital, Long idDistrito, String nombre, Long antiguedad, Double area, Long idSede,
            Long idGerente, Long idCondicion, Date fechaRegistro) {
        this.idHospital = idHospital;
        this.idDistrito = idDistrito;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.area = area;
        this.idSede = idSede;
        this.idGerente = idGerente;
        this.idCondicion = idCondicion;
        this.fechaRegistro = fechaRegistro;
    }

    
    

    public HospitalDTO() {
    }




    public Long getIdHospital() {
        return idHospital;
    }
    public void setIdHospital(Long idHospital) {
        this.idHospital = idHospital;
    }
    public Long getIdDistrito() {
        return idDistrito;
    }
    public void setIdDistrito(Long idDistrito) {
        this.idDistrito = idDistrito;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(Long antiguedad) {
        this.antiguedad = antiguedad;
    }
    public Double getArea() {
        return area;
    }
    public void setArea(Double area) {
        this.area = area;
    }
    public Long getIdSede() {
        return idSede;
    }
    public void setIdSede(Long idSede) {
        this.idSede = idSede;
    }
    public Long getIdGerente() {
        return idGerente;
    }
    public void setIdGerente(Long idGerente) {
        this.idGerente = idGerente;
    }
    public Long getIdCondicion() {
        return idCondicion;
    }
    public void setIdCondicion(Long idCondicion) {
        this.idCondicion = idCondicion;
    }
    public java.sql.Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(java.sql.Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
}
