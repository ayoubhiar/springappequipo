package com.grupo.SpringAppEquipo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.grupo.SpringAppEquipo.repository.ConsultaRepository;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.grupo.SpringAppEquipo.Service.ConsultaService;

@RestController
public class ConsultaController {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	@Autowired
    private ConsultaService consultaService;

    @PostMapping("/saveConsulta")
    public ResponseEntity<Object> saveConsulta(@RequestBody Map<String, Object> consulta) {
        return ResponseEntity.ok().body(consultaService.save(consulta));
    }
}
