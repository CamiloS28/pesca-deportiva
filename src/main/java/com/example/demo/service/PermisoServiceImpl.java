package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Afiliados;
import com.example.demo.models.Permisos;
import com.example.demo.repository.Repository;
import com.example.demo.repository.RepositoryPermisos;

@Service
public class PermisoServiceImpl implements PermisoService {

	@Autowired
	private RepositoryPermisos permisoRepository;

	@Override
	public List<Permisos> findPermisosByApellidoAfiliado(String apellido) {
		try {
			return permisoRepository.findPermisosByApellidoAfiliado(apellido);
		} catch (Exception e) {
			e.printStackTrace(); // Esto imprimirá el stack trace de la excepción.
			return new ArrayList<>(); // Devuelve una lista vacía si hay un error.
		}
	}

}
