package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Afiliados;
import com.example.demo.repository.Repository;

@Service
public class AfiliadoServicioImpl implements AfiliadoService {

	@Autowired
	private Repository repositorio;

	@Override
	public Afiliados guardarAfiliado(Afiliados afiliado) {
		return repositorio.save(afiliado);
	}

	@Override
	public List<Afiliados> listarAfiliados() {
		return repositorio.findAll();
	}

	@Override
	public Afiliados obtenerAfiliadoId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Afiliados actualizarAfiliado(Afiliados afiliado) {
		return repositorio.save(afiliado);
	}

	@Override
	public void eliminarAfiliado(Integer id) {
		repositorio.deleteById(id);
	}

	@Override
	public long contarAfiliados() {
		return repositorio.count();
	}

}
