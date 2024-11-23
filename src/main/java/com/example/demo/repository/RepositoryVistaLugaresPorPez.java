// LugaresPorPezRepository.java
package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.models.VistaLugaresPorPez;

public interface RepositoryVistaLugaresPorPez extends JpaRepository<VistaLugaresPorPez, String> {
	@Query("SELECT l FROM VistaLugaresPorPez l WHERE l.pez = :pez")
	List<VistaLugaresPorPez> buscarPez(@Param("pez") String pez);
}
