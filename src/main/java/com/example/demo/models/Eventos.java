package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Eventos")
@Getter
@Setter
public class Eventos {

    @Id
    @Column(name = "evento", nullable = false, length = 60)
    private String evento;

    @Column(name = "fecha_evento")
    @Temporal(TemporalType.DATE)  // Especifica que sólo se maneje la fecha sin tiempo
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Asegura que el formato de fecha sea el correcto
    private Date fechaEvento;

    @Column(name = "lugar", length = 50)
    private String lugar;

    @Column(name = "od_evento", columnDefinition = "TEXT")
    private String odEvento;

    public Eventos() {
    }

    public Eventos(String evento, Date fechaEvento, String lugar, String odEvento) {
        this.evento = evento;
        this.fechaEvento = fechaEvento;
        this.lugar = lugar;
        this.odEvento = odEvento;
    }

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOdEvento() {
		return odEvento;
	}

	public void setOdEvento(String odEvento) {
		this.odEvento = odEvento;
	}


}
