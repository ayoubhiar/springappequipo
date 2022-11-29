package com.grupo.SpringAppEquipo.entity;

import java.util.List;

import javax.persistence.Entity;

import lombok.Data;
@Entity
@Data
public class Medico {
	private Integer idMedico;
	private String nombreCompleto;
	private List<Paciente>pacientes;
	
	public Medico() {
		super();
	}
	
}
