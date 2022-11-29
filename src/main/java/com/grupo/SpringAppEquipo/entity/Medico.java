package com.grupo.SpringAppEquipo.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombreCompleto;
	private ArrayList<Integer>idPacientes;
	
	public Medico() {
		super();
	}

	
	public Medico(Integer id, String nombreCompleto, ArrayList<Integer> idPacientes) {
		super();
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.idPacientes = idPacientes;
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

	public ArrayList<Integer> getIdPacientes() {
		return idPacientes;
	}

	public void setIdPacientes(ArrayList<Integer> idPacientes) {
		this.idPacientes = idPacientes;
	}

	@Override
	public String toString() {
		return "Medico [id=" + id + ", nombreCompleto=" + nombreCompleto + ", idPacientes=" + idPacientes + "]";
	}
	
}
