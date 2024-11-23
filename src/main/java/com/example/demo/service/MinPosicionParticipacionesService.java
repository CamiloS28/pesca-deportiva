package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.MinPosicionParticipaciones;
import com.example.demo.repository.MinPosicionParticipacionesRepository;

public interface MinPosicionParticipacionesService {

	public List<MinPosicionParticipaciones> obtenerPorFicha(int ficha);
}
