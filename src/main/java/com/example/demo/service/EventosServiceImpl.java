package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Eventos;
import com.example.demo.repository.RepositoryEventos;
@Service
public class EventosServiceImpl implements EventosService {

	@Autowired
	private RepositoryEventos repositorio;

	@Override
	public List<Eventos> listarEventos() {
		return repositorio.findAll();
	}

	@Override
	public Eventos actualizarEvento(Eventos evento) {
		return repositorio.save(evento);
	}

	@Override
	public void eliminarEvento(String nEvento) {
		repositorio.deleteById(nEvento);
	}

	@Override
	public long contarEventos() {
		return repositorio.count();
	}

	@Override
	public Eventos obtenerEventoNom(String nEvento) {
		return repositorio.findById(nEvento).get();
	}

	@Override
	public Eventos guardarEvento(Eventos evento) {
		return repositorio.save(evento);
	}

}
