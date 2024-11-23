package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Cauces;

public interface RepositoryCauce extends JpaRepository<Cauces, String>{

	 @Procedure("eliminar_cauce")
	    void eliminarRegistroCauces(@Param("p_cauce") String nombreCauce);
	 
	 @Query("SELECT c.cauce FROM Cauces c")
		List<String> nombreCauces();
}
