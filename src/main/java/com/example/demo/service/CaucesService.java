package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Afiliados;
import com.example.demo.models.Cauces;
import com.example.demo.models.Peces;

public interface CaucesService {

	public List<Cauces> listar();
	
	public List<String> obtenerNombrCauce();

	public Cauces guardarCauce(Cauces cauce);

	public long contarCauces();

	public Cauces actualizarCauce(Cauces cauce);

	public Cauces obtenerCauceId(String cauce);

	public void eliminarCauce(String cauce);

	public void eliminarRegistroCauces(String cauce);
}
