package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Lugares;
import com.example.demo.repository.RepositoryLugares;
@Service
public class LugaresServiceImpl implements LugaresService{
	
	@Autowired
	private RepositoryLugares repositorio;

	@Override
	public List<Lugares> listarLugares() {
		return repositorio.findAll();
	}

	@Override
	public Lugares guardarLugares(Lugares lugar) {
		return repositorio.save(lugar);
	}

	@Override
	public Lugares obtenerLugarId(String nombre) {
		return repositorio.findById(nombre).get();
	}

	@Override
	public Lugares actualizarLugar(Lugares lugar) {
		return repositorio.save(lugar);
	}

	@Override
	public void eliminarLugar(String nombre) {
		repositorio.deleteById(nombre);
	}

	@Override
	public long contarLugares() {
		return repositorio.count();
	}

}
