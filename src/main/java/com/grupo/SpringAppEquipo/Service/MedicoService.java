package com.grupo.SpringAppEquipo.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo.SpringAppEquipo.entity.Medico;
import com.grupo.SpringAppEquipo.repository.MedicoRepository;

@Service
public class MedicoService {
	@Autowired
	private MedicoRepository medicoRepository;

	public MedicoService() {
		super();
		System.out.println("Creando una instancia de "+this.getClass().getSimpleName());
	}
	@Transactional
	public void insertar(Medico medico) {
		medicoRepository.save(medico);
	}
	@Transactional
	public void modificar(Medico medico) {
		medicoRepository.save(medico);
	}
	@Transactional
	public void eliminar(Medico medico) {
		medicoRepository.delete(medico);
	}
	
}
