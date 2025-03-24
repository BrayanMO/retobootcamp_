package com.bootcamp.reto2.backend.reto2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.reto2.backend.reto2.models.Distrito;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito, Long> {
}
