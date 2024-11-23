package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Participaciones;
import com.example.demo.repository.RepositoryParticipaciones;

@Service
public class ParticipacionesImpl implements ParticipacionesService {

	@Autowired
	private RepositoryParticipaciones repositorio;

	@Override
	public List<Participaciones> buscarParticipacionesPorFicha(int ficha) {
		try {
			return repositorio.buscarMinPoscionParticipacionesPorFicha(ficha);
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();

		}
	}

	@Override
	public List<String> nombreEventos() {
		return repositorio.nombreEventos();
	}

}
