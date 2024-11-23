package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Afiliados;
import com.example.demo.models.Cauces;
import com.example.demo.repository.Repository;
import com.example.demo.repository.RepositoryCauce;

@Service
public class CaucesServiceImpl implements CaucesService {

	@Autowired
	private RepositoryCauce cauceRepository;

	@Override
	public List<Cauces> listar() {
		return cauceRepository.findAll();
	}

	@Override
	public Cauces guardarCauce(Cauces cauce) {
		return cauceRepository.save(cauce);
	}

	@Override
	public long contarCauces() {
		return cauceRepository.count();
	}

	@Override
	public Cauces actualizarCauce(Cauces cauce) {
		return cauceRepository.save(cauce);
	}

	@Override
	public Cauces obtenerCauceId(String cauce) {
		return cauceRepository.findById(cauce).get();
	}

	@Override
	public void eliminarCauce(String cauce) {
		cauceRepository.deleteById(cauce);		
	}

	@Override
	public void eliminarRegistroCauces(String cauce) {
		cauceRepository.eliminarRegistroCauces(cauce);
	}

	@Override
	public List<String> obtenerNombrCauce() {
		return cauceRepository.nombreCauces();
	}



}
