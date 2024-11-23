package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@IdClass(ParticipacionId.class)
public class Participaciones {

	@Id
	private int ficha; // Asegúrate de que esto sea parte de la clave primaria.

	@Id
	private String evento; // Asegúrate de que esto sea parte de la clave primaria.

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ficha", referencedColumnName = "ficha", insertable = false, updatable = false)
	private Afiliados afiliado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "evento", referencedColumnName = "evento", insertable = false, updatable = false)
	private Eventos eventoDetalle;

	@Column(name = "posicion")
	@Getter
	@Setter
	private int posicion;

	@Column(name = "trofeo", nullable = true)
	@Getter
	@Setter
	private String trofeo;

	public Participaciones() {

	}

	public Participaciones(int ficha, String evento, Afiliados afiliado, Eventos eventoDetalle, int posicion,
			String trofeo) {
		super();
		this.ficha = ficha;
		this.evento = evento;
		this.afiliado = afiliado;
		this.eventoDetalle = eventoDetalle;
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

	public Afiliados getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(Afiliados afiliado) {
		this.afiliado = afiliado;
	}

	public Eventos getEventoDetalle() {
		return eventoDetalle;
	}

	public void setEventoDetalle(Eventos eventoDetalle) {
		this.eventoDetalle = eventoDetalle;
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

}
