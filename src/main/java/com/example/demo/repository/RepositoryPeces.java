package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Peces;

public interface RepositoryPeces extends JpaRepository<Peces, String> {

	
	 @Query("SELECT DISTINCT p.nombrePez FROM Peces p")
	    List<String> findDistinctPezNames();
}
