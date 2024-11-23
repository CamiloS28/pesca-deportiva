package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Permisos;

public interface PermisoService {

	List<Permisos> findPermisosByApellidoAfiliado(String apellido);
}
