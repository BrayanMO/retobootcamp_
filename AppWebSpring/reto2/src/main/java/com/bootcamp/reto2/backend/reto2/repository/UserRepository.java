package com.bootcamp.reto2.backend.reto2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.reto2.backend.reto2.models.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}