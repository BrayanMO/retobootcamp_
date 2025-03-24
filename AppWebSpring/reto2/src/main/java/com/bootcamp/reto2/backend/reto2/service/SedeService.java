package com.bootcamp.reto2.backend.reto2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.reto2.backend.reto2.models.Sede;
import com.bootcamp.reto2.backend.reto2.repository.SedeRepository;

import java.util.*;

@Service
public class SedeService {

    @Autowired
    private SedeRepository sedeRepository;

    public List<Sede> obtenerTodasLasSedes() {
        return sedeRepository.findAll();
    }
}

