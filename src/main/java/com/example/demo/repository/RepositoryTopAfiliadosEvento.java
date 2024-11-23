// RepositoryTopAfiliadosEvento.java
package com.example.demo.repository;

import com.example.demo.models.TopAfiliadosEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryTopAfiliadosEvento extends JpaRepository<TopAfiliadosEvento, Integer> {

    @Query("SELECT t FROM TopAfiliadosEvento t WHERE t.evento = :evento")
    List<TopAfiliadosEvento> buscarTopTres(@Param("evento") String evento);
}
