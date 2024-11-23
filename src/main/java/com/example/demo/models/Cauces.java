package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Cauces {
	@Id
	@Column(name = "cauce", nullable = false)
	@Getter
	@Setter
	private String cauce;
	 
	@Column(name = "od_cauce")
	@Getter
	@Setter
	private String od_cause;

	public Cauces() {
		// TODO Auto-generated constructor stub
	}

	public Cauces(String cauce, String od_cause) {
		super();
		this.cauce = cauce;
		this.od_cause = od_cause;
	}

	public String getCauce() {
		return cauce;
	}

	public void setCauce(String cauce) {
		this.cauce = cauce;
	}

	public String getOd_cause() {
		return od_cause;
	}

	public void setOd_cause(String od_cause) {
		this.od_cause = od_cause;
	}


}
