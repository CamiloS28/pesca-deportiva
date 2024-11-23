package com.example.demo.models;

import java.io.Serializable;
import java.util.Objects;

public class VLicenciaId implements Serializable {

	private int ficha;

	private String licencia;

	public VLicenciaId() {
		// TODO Auto-generated constructor stub
	}
	
	
	public VLicenciaId(int ficha, String licencia) {
		super();
		this.ficha = ficha;
		this.licencia = licencia;
	}


	public int getFicha() {
		return ficha;
	}

	public void setFicha(int ficha) {
		this.ficha = ficha;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ficha, licencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VLicenciaId other = (VLicenciaId) obj;
		return ficha == other.ficha && Objects.equals(licencia, other.licencia);
	}

}
