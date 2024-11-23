package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Eventos;

public interface RepositoryEventos extends JpaRepository<Eventos, String> {

}
