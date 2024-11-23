package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "v_afiliados_eventos_1995")
public class VistaAfiliadosEventos1995 {

    @Id
    @Column(name = "ficha")
    private int ficha;

    @Column(name = "nombre_afiliado")
    private String nombreAfiliado;

    @Column(name = "apellidos_afiliado")
    private String apellidosAfiliado;

    @Column(name = "evento")
    private String evento;

    @Column(name = "fecha_evento")
    private String fechaEvento;

    // Getters y Setters
    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
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

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
    
}
