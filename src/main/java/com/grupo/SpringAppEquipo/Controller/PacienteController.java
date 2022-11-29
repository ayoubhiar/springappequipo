package com.grupo.SpringAppEquipo.Controller;

import com.grupo.SpringAppEquipo.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PostMapping("/savePaciente")
    public ResponseEntity<Object> savePaciente(@RequestBody Map<String, Object> paciente) {
        return ResponseEntity.ok().body(pacienteService.save(paciente));
    }

    @GetMapping("findAllPacientes")
    public ResponseEntity<Object> findAll() {
        return ResponseEntity.ok().body(pacienteService.findAll());
    }
}
