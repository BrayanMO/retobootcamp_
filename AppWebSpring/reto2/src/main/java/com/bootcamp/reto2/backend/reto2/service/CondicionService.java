package com.bootcamp.reto2.backend.reto2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.reto2.backend.reto2.models.Condicion;
import com.bootcamp.reto2.backend.reto2.repository.CondicionRepository;
import java.util.*;

@Service
public class CondicionService {
    @Autowired
    private CondicionRepository condicionRepository;

    public List<Condicion> obtenerTodasLasCondiciones() {
        return condicionRepository.findAll();
    }
}
