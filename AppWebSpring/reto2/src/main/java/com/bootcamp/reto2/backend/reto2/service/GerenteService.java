package com.bootcamp.reto2.backend.reto2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.reto2.backend.reto2.models.Gerente;
import com.bootcamp.reto2.backend.reto2.repository.GerenteRepository;

@Service
public class GerenteService {

     @Autowired
    private GerenteRepository gerenteRepository;

    public List<Gerente> obtenerTodoslosGerentes() {
        return gerenteRepository.findAll();
    }
}
    