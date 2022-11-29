package com.grupo.SpringAppEquipo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombreCompleto;
	
	private String enfermedad;
	
	private Integer edad;
	
	public Paciente() {
		super();
	}
	
	public Paciente(Integer id, String nombreCompleto, String enfermedad, Integer edad) {
		super();
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.enfermedad = enfermedad;
		this.edad = edad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombreCompleto=" + nombreCompleto + ", enfermedad=" + enfermedad + ", edad="
				+ edad + "]";
	}
	
}
