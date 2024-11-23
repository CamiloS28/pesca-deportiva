package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.PermisoId;
import com.example.demo.models.Permisos;
import com.example.demo.models.VLicenciaId;
import com.example.demo.models.Vlicencia;

public interface RepositoryViewP extends JpaRepository<Vlicencia, VLicenciaId> {

	@Query(value = "SELECT licencia,ficha FROM vlicencia WHERE apellidos_afiliado = ?1", nativeQuery = true)
	List<Vlicencia> findPermisosByApellidoAfiliado(@Param("apellidosAfiliado") String apellidosAfiliado);


}
