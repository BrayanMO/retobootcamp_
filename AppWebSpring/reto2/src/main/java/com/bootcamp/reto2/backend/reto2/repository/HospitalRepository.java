package com.bootcamp.reto2.backend.reto2.repository;

import com.bootcamp.reto2.backend.reto2.models.Hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    @Procedure(name = "SP_HOSPITAL_REGISTRAR") 
    void SP_HOSPITAL_REGISTRAR(
        @Param("v_idHospital") Long idHospital,
        @Param("v_idDistrito") Long idDistrito,
        @Param("v_nombre") String nombre,
        @Param("v_antiguedad") Long antiguedad,
        @Param("v_area") Double area,
        @Param("v_idSede") Long idSede,
        @Param("v_idGerente") Long idGerente,
        @Param("v_idCondicion") Long idCondicion,
        @Param("v_fechaRegistro") java.sql.Date fechaRegistro
    );

    @Procedure(name = "SP_HOSPITAL_ACTUALIZAR")
    void SP_HOSPITAL_ACTUALIZAR(
        @Param("v_idHospital") Long idHospital,
        @Param("v_idDistrito") Long idDistrito,
        @Param("v_nombre") String nombre,
        @Param("v_antiguedad") Long antiguedad,
        @Param("v_area") Double area,
        @Param("v_idSede") Long idSede,
        @Param("v_idGerente") Long idGerente,
        @Param("v_idCondicion") Long idCondicion,
        @Param("v_fechaRegistro") java.sql.Date fechaRegistro
    );

    @Procedure(name = "SP_HOSPITAL_ELIMINAR")
    void SP_HOSPITAL_ELIMINAR(
        @Param("v_idHospital") Long idHospital
    );


    @Procedure(name = "SP_HOSPITAL_LISTAR")
    List<Object[]> listarHospitales(
        @Param("v_idHospital") Long idHospital
    );
}