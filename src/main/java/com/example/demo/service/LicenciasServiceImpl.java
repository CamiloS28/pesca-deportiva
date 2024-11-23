package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Afiliados;
import com.example.demo.models.Licencias;
import com.example.demo.repository.RepositoryLicencias;

@Service
public class LicenciasServiceImpl implements LicenciasService {

	@Autowired
	public RepositoryLicencias repositorio;

	@Override
	public List<Licencias> listarLicencias() {
		return repositorio.findAll();
	}

	@Override
	public Licencias guardarLicencias(Licencias licencia) {
		return repositorio.save(licencia);
	}

	@Override
	public Licencias obtenerLicenciaId(String licencia) {
		return repositorio.findById(licencia).get();
	}

	@Override
	public Licencias actualizarLicencia(Licencias licencia) {
		return repositorio.save(licencia);
	}

	@Override
	public void eliminarLicencia(String licencia) {
		repositorio.deleteById(licencia);		
	}

}
