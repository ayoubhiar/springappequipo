package com.grupo.SpringAppEquipo.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	   public Map<String, String> save(Map<String, Object> medico) {
	        Medico m = new Medico();
	        Map<String, String> response = new HashMap<>();

	        try {
	            m.setIdPacientes((ArrayList<Integer>)medico.get("idPacientes"));
	            m.setNombreCompleto((String) medico.get("nombreCompleto"));
	            medicoRepository.save(m);

	            response.put("status", "usuario guardado con éxito");
	        } catch (Exception e) {
	            response.put("error", e.getMessage());
	        }
	        return response;
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
