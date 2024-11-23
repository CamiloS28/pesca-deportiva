// MinPosicionParticipaciones.java
package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "v_lugares_por_pez")
public class VistaLugaresPorPez {
	@Id
    @Column(name = "lugar") 
    private String lugar;

    @Column(name = "cauce")
    private String cauce;

    @Column(name = "comunidad")
    private String comunidad;

    @Column(name = "pez")
    private String pez;

	public VistaLugaresPorPez() {

	}

	public VistaLugaresPorPez(String lugar, String cauce, String comunidad, String pez) {
		super();
		this.lugar = lugar;
		this.cauce = cauce;
		this.comunidad = comunidad;
		this.pez = pez;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getCauce() {
		return cauce;
	}

	public void setCauce(String cauce) {
		this.cauce = cauce;
	}

	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	public String getPez() {
		return pez;
	}

	public void setPez(String pez) {
		this.pez = pez;
	}

	@Override
	public String toString() {
		return "VistaLugaresPorPez{" + "lugar='" + lugar + '\'' + ", cauce=" + cauce + ", comunidad='" + comunidad
				+ '\'' + '}';
	}

}
