package com.bootcamp.reto2.backend.reto2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.reto2.backend.reto2.models.Distrito;
import java.util.*;

import com.bootcamp.reto2.backend.reto2.repository.DistritoRepository;

@Service
public class DistritoService {
    @Autowired
    private DistritoRepository distritoRepository;

    public List<Distrito> obtenerTodosLosDistritos() {
        return distritoRepository.findAll(); // Asumiendo que usas Spring Data JPA
    }
}
