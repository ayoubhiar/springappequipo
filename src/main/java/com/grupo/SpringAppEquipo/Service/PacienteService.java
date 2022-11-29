package com.grupo.SpringAppEquipo.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo.SpringAppEquipo.entity.Paciente;
import com.grupo.SpringAppEquipo.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public Map<String, String> save(Map<String, Object> paciente) {
        Paciente p = new Paciente();
        Map<String, String> response = new HashMap<>();

        try {
            p.setEdad((Integer) paciente.get("edad"));
            p.setEnfermedad((String) paciente.get("enfermedad"));
            p.setNombreCompleto((String) paciente.get("NombreCompleto"));
            pacienteRepository.save(p);

            response.put("status", "usuario guardado con éxito");
        } catch (Exception e) {
            response.put("error", e.getMessage());
        }
        return response;
    }
}
