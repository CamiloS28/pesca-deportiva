package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Afiliados;
import com.example.demo.models.Eventos;

public interface EventosService {
	
	public List<Eventos> listarEventos();
	
	public Eventos guardarEvento(Eventos evento);

	public Eventos actualizarEvento(Eventos evento);

	public void eliminarEvento(String nEvento);
	
	public long contarEventos();
	
	public Eventos obtenerEventoNom(String nEvento);

}
