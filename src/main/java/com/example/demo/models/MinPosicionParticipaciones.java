package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "v_min_posicion_participaciones")
public class MinPosicionParticipaciones {
	@Column
	private int ficha;

	@Id
	@Column
	private String evento;

	@Column
	private int posicion;

	@Column
	private String trofeo;

	public MinPosicionParticipaciones() {

	}

	public MinPosicionParticipaciones(int ficha, String evento, int posicion, String trofeo) {
		super();
		this.ficha = ficha;
		this.evento = evento;
		this.posicion = posicion;
		this.trofeo = trofeo;
	}

	public int getFicha() {
		return ficha;
	}

	public void setFicha(int ficha) {
		this.ficha = ficha;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getTrofeo() {
		return trofeo;
	}

	public void setTrofeo(String trofeo) {
		this.trofeo = trofeo;
	}

	@Override
	public String toString() {
		return "MinPosicionParticipaciones{" + "evento='" + evento + '\'' + ", posicion=" + posicion + ", trofeo='"
				+ trofeo + '\'' + '}';
	}
}
