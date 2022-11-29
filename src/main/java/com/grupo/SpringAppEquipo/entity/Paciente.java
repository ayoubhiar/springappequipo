package com.grupo.SpringAppEquipo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombreCompleto")
	private String nombreCompleto;
	
	@Column(name = "enfermedad")
	private String enfermedad;
	
	private Integer edad;
	
	public Paciente() {
		super();
	}
}
