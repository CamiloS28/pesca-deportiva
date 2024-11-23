package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.TopAfiliadosEvento;
import com.example.demo.repository.RepositoryTopAfiliadosEvento;

@Service
public class TopAfiliadosEventosServiceImpl implements TopAfiliadosEventoService{

	@Autowired
	private RepositoryTopAfiliadosEvento repositorio;
	@Override
	public List<TopAfiliadosEvento> buscarTop(String evento) {
		return repositorio.buscarTopTres(evento);
	}

}
