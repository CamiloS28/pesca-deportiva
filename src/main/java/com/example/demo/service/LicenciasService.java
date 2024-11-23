package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Cauces;
import com.example.demo.models.Licencias;

public interface LicenciasService {

	public List<Licencias> listarLicencias();

	public Licencias guardarLicencias(Licencias licencia);

	public Licencias obtenerLicenciaId(String licencia);
	
	public Licencias actualizarLicencia(Licencias licencia);

	public void eliminarLicencia(String licencia);
}
