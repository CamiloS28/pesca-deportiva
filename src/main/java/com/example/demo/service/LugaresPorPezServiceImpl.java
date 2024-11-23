package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.VistaLugaresPorPez;
import com.example.demo.repository.RepositoryVistaLugaresPorPez;

@Service
public class LugaresPorPezServiceImpl implements LugaresPorPezService {

	@Autowired
	private RepositoryVistaLugaresPorPez repositorio;

	@Override
	public List<VistaLugaresPorPez> buscarPez(String pez) {
		return repositorio.buscarPez(pez);
	}

}
