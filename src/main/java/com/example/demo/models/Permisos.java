package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(PermisoId.class)
public class Permisos {

	@Id
	private int ficha; // Clave foránea y parte de la clave primaria

	@Id
	private String licencia; // Clave foránea y parte de la clave primaria

	@ManyToOne
	@JoinColumn(name = "ficha", referencedColumnName = "ficha", insertable = false, updatable = false)
	private Afiliados afiliado; // Relación Many-to-One

	@ManyToOne
	@JoinColumn(name = "licencia", referencedColumnName = "licencia", insertable = false, updatable = false)
	private Licencias licenciaDetalle; // Relación Many-to-One

	public Permisos() {

	}

	public Permisos(int ficha, String licencia, Afiliados afiliado, Licencias licenciaDetalle) {
		super();
		this.ficha = ficha;
		this.licencia = licencia;
		this.afiliado = afiliado;
		this.licenciaDetalle = licenciaDetalle;
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

	public Afiliados getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(Afiliados afiliado) {
		this.afiliado = afiliado;
	}

	public Licencias getLicenciaDetalle() {
		return licenciaDetalle;
	}

	public void setLicenciaDetalle(Licencias licenciaDetalle) {
		this.licenciaDetalle = licenciaDetalle;
	}

}
