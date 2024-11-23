package com.example.demo.models;

import java.io.Serializable;
import java.util.Objects;

public class PermisoId implements Serializable {
	
	private int ficha;

	private String licencia;

	public PermisoId() {

	}

	public PermisoId(int ficha, String licencia) {
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
		PermisoId other = (PermisoId) obj;
		return ficha == other.ficha && Objects.equals(licencia, other.licencia);
	}

}
