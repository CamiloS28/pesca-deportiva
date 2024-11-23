package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.MinPosicionParticipaciones;

public interface MinPosicionParticipacionesRepository extends JpaRepository<MinPosicionParticipaciones, String> {

	@Query("SELECT m FROM MinPosicionParticipaciones m WHERE m.ficha = :ficha")
	List<MinPosicionParticipaciones> findByFicha(@Param("ficha") int ficha);

}
