package com.grupo.SpringAppEquipo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaciente;
	private String nombreCompleto;
	private String enfermedad;
	private Integer edad;
	public Paciente() {
		super();
	}
	public Paciente(Integer idPaciente, String nombreCompleto, String enfermedad, Integer edad) {
		super();
		this.idPaciente = idPaciente;
		this.nombreCompleto = nombreCompleto;
		this.enfermedad = enfermedad;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", nombreCompleto=" + nombreCompleto + ", enfermedad=" + enfermedad
				+ ", edad=" + edad + "]";
	}
}
