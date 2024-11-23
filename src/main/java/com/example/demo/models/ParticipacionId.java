package com.example.demo.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;

public class ParticipacionId implements Serializable {

	private int ficha;

	private String evento;

	public ParticipacionId() {

	}

	public ParticipacionId(int ficha, String evento) {
		super();
		this.ficha = ficha;
		this.evento = evento;
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ParticipacionId that = (ParticipacionId) o;
		return ficha == that.ficha && Objects.equals(evento, that.evento);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ficha, evento);
	}
}
