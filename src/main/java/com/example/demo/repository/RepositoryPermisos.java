package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.PermisoId;
import com.example.demo.models.Permisos;

public interface RepositoryPermisos extends JpaRepository<Permisos, PermisoId> {

	@Query("SELECT p FROM Permisos p WHERE p.afiliado.apellidosAfiliado = :apellidosAfiliado")
	List<Permisos> findPermisosByApellidoAfiliado(@Param("apellidosAfiliado") String apellidosAfiliado);

}


