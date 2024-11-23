package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(VLicenciaId.class)
public class Vlicencia {

    @Id
    private int ficha;

    @Id
    private String licencia;

    public Vlicencia() {
    }

    public Vlicencia(int ficha, String licencia) {
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
    public String toString() {
    	// TODO Auto-generated method stub
    	return "licence plate "+licencia+" plus id "+ficha;
    }
}
