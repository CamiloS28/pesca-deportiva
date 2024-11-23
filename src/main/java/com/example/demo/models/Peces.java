package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Peces {

	@Id
	@Column(name = "pez", nullable = false)
	@Getter
	@Setter
	private String nombrePez;

	@Column(name = "od_pez")
	@Getter
	@Setter
	private String odPez;

	public Peces(String nombre, String odPez) {
		super();
		this.nombrePez = nombre;
		this.odPez = odPez;
	}

	public Peces() {

	}

	public String getNombrePez() {
		return nombrePez;
	}

	public void setNombrePez(String nombrePez) {
		this.nombrePez = nombrePez;
	}

	public String getOdPez() {
		return odPez;
	}

	public void setOdPez(String odPez) {
		this.odPez = odPez;
	}

}
