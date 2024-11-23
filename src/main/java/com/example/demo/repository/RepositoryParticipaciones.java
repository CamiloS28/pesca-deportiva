package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.ParticipacionId;
import com.example.demo.models.Participaciones;

public interface RepositoryParticipaciones extends JpaRepository<Participaciones, ParticipacionId> {

	@Query("SELECT p FROM Participaciones p WHERE p.ficha = :ficha AND p.posicion = (SELECT MIN(p2.posicion) FROM Participaciones p2 WHERE p2.ficha = :ficha)")
	List<Participaciones> buscarMinPoscionParticipacionesPorFicha(@Param("ficha") int ficha);

	@Query("SELECT p.evento FROM Participaciones p GROUP BY p.evento HAVING COUNT(p.ficha) >= 3")
	List<String> nombreEventos();
}
