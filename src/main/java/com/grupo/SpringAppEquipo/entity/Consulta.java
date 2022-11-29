package com.grupo.SpringAppEquipo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
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
	
}
