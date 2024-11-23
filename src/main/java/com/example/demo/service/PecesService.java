package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Afiliados;
import com.example.demo.models.Peces;

public interface PecesService {

	public List<Peces> listarPeces();

	public Peces guardarPez(Peces pez);

	public Peces actualizarPez(Peces pez);

	public void eliminarPez(String nombre);

	public long contarPeces();

	public List<String> getDistinctPezNames();

	public Peces obtenerPezNombre(String nombre);

}
