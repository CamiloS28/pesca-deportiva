package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Afiliados;
import com.example.demo.models.Peces;
import com.example.demo.repository.RepositoryPeces;

@Service
public class PecesServicioImpl implements PecesService {

	@Autowired
	private RepositoryPeces repositorioPeces;

	@Override
	public List<Peces> listarPeces() {
		return repositorioPeces.findAll();
	}

	@Override
	public long contarPeces() {
		return repositorioPeces.count();
	}

	@Override
	public Peces guardarPez(Peces pez) {
		return repositorioPeces.save(pez);
	}

	@Override
	public List<String> getDistinctPezNames() {
		return repositorioPeces.findDistinctPezNames();
	}

	@Override
	public Peces actualizarPez(Peces pez) {
		return repositorioPeces.save(pez);
	}

	@Override
	public void eliminarPez(String nombre) {
		repositorioPeces.deleteById(nombre);
	}

	@Override
	public Peces obtenerPezNombre(String nombre) {
		return repositorioPeces.findById(nombre).get();
	}

}
