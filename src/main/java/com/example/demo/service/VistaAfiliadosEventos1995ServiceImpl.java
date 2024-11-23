package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.VistaAfiliadosEventos1995;
import com.example.demo.repository.RepositoryVistaAfiliadosEventos1995;

@Service
public class VistaAfiliadosEventos1995ServiceImpl implements VistaAfiliadosEventos1995Service {

	@Autowired
	private RepositoryVistaAfiliadosEventos1995 repositorio;

	@Override
	public List<VistaAfiliadosEventos1995> listarAfiliadosEventos1995() {
		return repositorio.findAll();
	}

}
