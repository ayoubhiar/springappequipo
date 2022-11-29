package com.grupo.SpringAppEquipo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idPaciente;
	private Integer idMedico;
	private String observaciones;
	private String fecha;
	public Consulta() {
		super();
	}
	
	public Consulta(Integer id, Integer idPaciente, Integer idMedico, String observaciones, String fecha) {
		super();
		this.id = id;
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
		this.observaciones = observaciones;
		this.fecha = fecha;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Consulta [id=" + id + ", idPaciente=" + idPaciente + ", idMedico=" + idMedico + ", observaciones="
				+ observaciones + ", fecha=" + fecha + "]";
	}
	
}
