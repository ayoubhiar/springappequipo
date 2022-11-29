package com.grupo.SpringAppEquipo.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo.SpringAppEquipo.entity.Consulta;
import com.grupo.SpringAppEquipo.repository.ConsultaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	public Map<String, String> save(Map<String, Object> consulta) {
        Consulta c = new Consulta();
        Map<String, String> response = new HashMap<>();

        try {
            c.setIdPaciente((Integer) consulta.get("idPaciente"));
            c.setIdMedico((Integer) consulta.get("idMedico"));
            c.setObservaciones((String) consulta.get("observaciones"));
            c.setFecha((String) consulta.get("fecha"));
            consultaRepository.save(c);

            response.put("status", "usuario guardado con éxito");
        } catch (Exception e) {
            response.put("error", e.getMessage());
        }
        return response;
    }
	
}
