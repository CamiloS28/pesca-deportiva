package com.example.demo.models;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Afiliados {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ficha")
	@Getter
	@Setter
	private int id;

	@Column(name = "nombre_afiliado", nullable= false)
	@Getter
	@Setter
	private String nombreAfiliado;

	@Column(name = "apellidos_afiliado", nullable=false)
	@Getter
	@Setter
	private String apellidosAfiliado;

	@Column(name = "direccion_afiliado")
	@Getter
	@Setter
	private String direccionAfiliado;

	@Column(name = "telf_afiliado")
	@Getter
	@Setter
	private long telefonoAfiliado;

	@Column(name = "sexo_afiliado")
	@Getter
	@Setter
	private char sexoAfiliado;

	@Column(name = "nacimiento_afiliado")
	@Getter
	@Setter
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date nacimientoAfiliado;


	@Column(name = "od_afiliado")
	@Getter
	@Setter
	private String odAfiliado;

	public Afiliados(int id, String nombreAfiliado, String apellidosAfiliado, String direccionAfiliado,
			int telefonoAfiliado, char sexoAfiliado, Date nacimientoAfiliado, String odAfiliado) {
		super();
		this.id = id;
		this.nombreAfiliado = nombreAfiliado;
		this.apellidosAfiliado = apellidosAfiliado;
		this.direccionAfiliado = direccionAfiliado;
		this.telefonoAfiliado = telefonoAfiliado;
		this.sexoAfiliado = sexoAfiliado;
		this.nacimientoAfiliado = nacimientoAfiliado;
		this.odAfiliado = odAfiliado;
	}

	public Afiliados() { // por la nomenclatura y evitar error

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreAfiliado() {
		return nombreAfiliado;
	}

	public void setNombreAfiliado(String nombreAfiliado) {
		this.nombreAfiliado = nombreAfiliado;
	}

	public String getApellidosAfiliado() {
		return apellidosAfiliado;
	}

	public void setApellidosAfiliado(String apellidosAfiliado) {
		this.apellidosAfiliado = apellidosAfiliado;
	}

	public String getDireccionAfiliado() {
		return direccionAfiliado;
	}

	public void setDireccionAfiliado(String direccionAfiliado) {
		this.direccionAfiliado = direccionAfiliado;
	}

	public long getTelefonoAfiliado() {
		return telefonoAfiliado;
	}

	public void setTelefonoAfiliado(long telefonoAfiliado) {
		this.telefonoAfiliado = telefonoAfiliado;
	}

	public char getSexoAfiliado() {
		return sexoAfiliado;
	}

	public void setSexoAfiliado(char sexoAfiliado) {
		this.sexoAfiliado = sexoAfiliado;
	}

	public Date getNacimientoAfiliado() {
		return nacimientoAfiliado;
	}

	public void setNacimientoAfiliado(Date nacimientoAfiliado) {
		this.nacimientoAfiliado = nacimientoAfiliado;
	}

	public String getOdAfiliado() {
		return odAfiliado;
	}

	public void setOdAfiliado(String odAfiliado) {
		this.odAfiliado = odAfiliado;
	}

	@Override
	public String toString() { // por si
		return "Afiliados [id=" + id + ", nombreAfiliado=" + nombreAfiliado + ", apellidosAfiliado=" + apellidosAfiliado
				+ ", direccionAfiliado=" + direccionAfiliado + ", telefonoAfiliado=" + telefonoAfiliado
				+ ", sexoAfiliado=" + sexoAfiliado + ", nacimientoAfiliado=" + nacimientoAfiliado + ", odAfiliado="
				+ odAfiliado + "]";
	}

}
