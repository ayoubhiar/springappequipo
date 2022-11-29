package com.grupo.SpringAppEquipo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupo.SpringAppEquipo.Service.MedicoService;
import com.grupo.SpringAppEquipo.entity.Medico;
import com.grupo.SpringAppEquipo.repository.MedicoRepository;

@RestController
public class MedicoController {
	@Autowired
	private MedicoService medicoService;
	@Autowired
	private MedicoRepository medicoRepository;

	public MedicoController() {
		super();
		System.out.println("Creando una instancia de " + this.getClass().getSimpleName());
	}

	@GetMapping("/findMedico")
	public ResponseEntity<Object> findMedico(@RequestParam("id") Integer id) {
		System.out.println("Seleccionar médico con id " + id);
		Medico medico = medicoRepository.findById(id).orElse(new Medico());
		return ResponseEntity.ok().body(medico);
	}
	@GetMapping("/findAllMedico")
	public ResponseEntity<Object> findAllMedico() {
		return ResponseEntity.ok().body( medicoRepository.findAll());
	}
	@GetMapping("/findMedicoByName")
	public ResponseEntity<Object> findMedicoByName(String nombre) {
		return ResponseEntity.ok().body( medicoRepository.findByName(nombre));
	}

}
