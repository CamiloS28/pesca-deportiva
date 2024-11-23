package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Participaciones;

public interface ParticipacionesService {

	List<Participaciones> buscarParticipacionesPorFicha(int ficha);
	
	List<String> nombreEventos();
}
