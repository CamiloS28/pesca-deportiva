package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Lugares")
@Getter
@Setter
public class Lugares {

    @Id
    @Column(name = "lugar", nullable = false, length = 50)
    private String lugar;

    @Column(name = "comunidad", length = 20)
    private String comunidad;

    @Column(name = "od_lugar", columnDefinition = "TEXT")
    private String odLugar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cauce", nullable = false)
    private Cauces cauce;

    public Lugares() {
    }

    public Lugares(String lugar, String comunidad, String odLugar, Cauces cauce) {
        this.lugar = lugar;
        this.comunidad = comunidad;
        this.odLugar = odLugar;
        this.cauce = cauce;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public String getOdLugar() {
        return odLugar;
    }

    public void setOdLugar(String odLugar) {
        this.odLugar = odLugar;
    }

    public Cauces getCauce() {
        return cauce;
    }

    public void setCauce(Cauces cauce) {
        this.cauce = cauce;
    }
}
