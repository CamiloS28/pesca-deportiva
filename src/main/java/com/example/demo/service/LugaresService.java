package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Lugares;

public interface LugaresService {

	public List<Lugares> listarLugares();

	public Lugares guardarLugares(Lugares lugar);

	public Lugares obtenerLugarId(String nombre);

	public Lugares actualizarLugar(Lugares lugar);

	public void eliminarLugar(String nombre);
	
	public long contarLugares();
}

