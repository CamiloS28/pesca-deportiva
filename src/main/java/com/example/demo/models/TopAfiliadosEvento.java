package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Top_Afiliados_Evento")
public class TopAfiliadosEvento {

	@Id
	@Column(name = "ficha")
	private Integer ficha;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "posicion")
	private Integer posicion;

	@Column(name = "trofeo")
	private String trofeo;

	@Column(name = "evento")
	private String evento;

	public TopAfiliadosEvento() {

	}

	public TopAfiliadosEvento(Integer ficha, String nombre, String apellidos, Integer posicion, String trofeo,
			String evento) {
		super();
		this.ficha = ficha;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.posicion = posicion;
		this.trofeo = trofeo;
		this.evento = evento;
	}

	public Integer getFicha() {
		return ficha;
	}

	public void setFicha(Integer ficha) {
		this.ficha = ficha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public String getTrofeo() {
		return trofeo;
	}

	public void setTrofeo(String trofeo) {
		this.trofeo = trofeo;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	@Override
	public String toString() {
		return "TopAfiliadosEvento [ficha=" + ficha + ", nombre=" + nombre + ", apellidos=" + apellidos + ", posicion="
				+ posicion + ", trofeo=" + trofeo + "]";
	}

}
