package com.bootcamp.reto2.backend.reto2.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.reto2.backend.reto2.dto.HospitalDTO;
import com.bootcamp.reto2.backend.reto2.models.Hospital;
import com.bootcamp.reto2.backend.reto2.repository.HospitalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private HospitalRepository hospitalRepository;

     // Obtiene un hospital por su ID
     public HospitalDTO getHospitalById(Long idHospital) {
        Optional<Hospital> hospitalOpt = hospitalRepository.findById(idHospital);
        if (hospitalOpt.isPresent()) {
            Hospital hospital = hospitalOpt.get();
            HospitalDTO dto = new HospitalDTO();
            // Mapea las propiedades de la entidad al DTO
            dto.setIdHospital(hospital.getIdHospital());
            dto.setIdDistrito(hospital.getIdDistrito());
            dto.setNombre(hospital.getNombre());
            dto.setAntiguedad(hospital.getAntiguedad());
            dto.setArea(hospital.getArea());
            dto.setIdSede(hospital.getIdSede());
            dto.setIdGerente(hospital.getIdGerente());
            dto.setIdCondicion(hospital.getIdCondicion());
            dto.setFechaRegistro(hospital.getFechaRegistro());
            return dto;
        } else {
            throw new RuntimeException("No se encontró el hospital con ID: " + idHospital);
        }
    }

    public void SP_HOSPITAL_REGISTRAR(HospitalDTO hospitalDTO) {
        hospitalRepository.SP_HOSPITAL_REGISTRAR(
            hospitalDTO.getIdHospital(),
            hospitalDTO.getIdDistrito(),
            hospitalDTO.getNombre(),
            hospitalDTO.getAntiguedad(),
            hospitalDTO.getArea(),
            hospitalDTO.getIdSede(),
            hospitalDTO.getIdGerente(),
            hospitalDTO.getIdCondicion(),
            hospitalDTO.getFechaRegistro()
        );
    }
    public void SP_HOSPITAL_ACTUALIZAR(HospitalDTO hospitalDTO) {
            // Validación de campos obligatorios
    if (hospitalDTO.getIdHospital() == null || hospitalDTO.getIdHospital() <= 0) {
        throw new IllegalArgumentException("El ID del hospital es inválido.");
    }
    if (hospitalDTO.getNombre() == null || hospitalDTO.getNombre().isEmpty()) {
        throw new IllegalArgumentException("El nombre del hospital no puede estar vacío.");
    }
        hospitalRepository.SP_HOSPITAL_ACTUALIZAR(
            hospitalDTO.getIdHospital(),
            hospitalDTO.getIdDistrito(),
            hospitalDTO.getNombre(),
            hospitalDTO.getAntiguedad(),
            hospitalDTO.getArea(),
            hospitalDTO.getIdSede(),
            hospitalDTO.getIdGerente(),
            hospitalDTO.getIdCondicion(),
            hospitalDTO.getFechaRegistro()
        );
    }

    public void SP_HOSPITAL_ELIMINAR(Long idHospital) {
        try {
            hospitalRepository.SP_HOSPITAL_ELIMINAR(idHospital);
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar hospital: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<Object[]> listarHospitales(Long idHospital) {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("SP_HOSPITAL_LISTAR");
        
        // Registrar los parámetros
        query.registerStoredProcedureParameter("v_idHospital", Long.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("v_cursor", void.class, ParameterMode.REF_CURSOR);
        
        // Setear el parámetro de entrada
        query.setParameter("v_idHospital", idHospital);

        // Ejecutar el procedimiento
        query.execute();
        
        // Obtener resultados
        return (List<Object[]>) query.getResultList();
    }

}
