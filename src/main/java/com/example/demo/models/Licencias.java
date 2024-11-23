package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Licencias {

	@Id
	@Column(name = "licencia")
	@Getter
	@Setter
	private String nLicencia;

	public Licencias(String nLicencia) {
		super();
		this.nLicencia = nLicencia;
	}

	public Licencias() {

	}

	public String getnLicencia() {
	    return nLicencia;
	}

	public void setnLicencia(String nLicencia) {
	    this.nLicencia = nLicencia;
	}


}
