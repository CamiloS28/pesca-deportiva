package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Afiliados;

public interface AfiliadoService {

	public List<Afiliados> listarAfiliados();

	public Afiliados guardarAfiliado(Afiliados afiliado);

	public Afiliados obtenerAfiliadoId(Integer id);

	public Afiliados actualizarAfiliado(Afiliados afiliado);

	public void eliminarAfiliado(Integer id);
	
	public long contarAfiliados();
}
