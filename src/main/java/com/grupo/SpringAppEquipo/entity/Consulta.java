package com.grupo.SpringAppEquipo.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Consulta {
	private Integer idConsulta;
	private Paciente paciente;
	private Medico medico;
	private String observaciones;
	private String fecha;
	public Consulta() {
		super();
	}
	
}
