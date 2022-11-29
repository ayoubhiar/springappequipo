package com.grupo.SpringAppEquipo.repository;

import com.grupo.SpringAppEquipo.entity.Consulta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
	
	@Query("select c from Consulta c where idMedico=:idMedico")
	List<Consulta>listarConsultasPorMedico(@Param("idMedico") Integer idMedico);
	
	@Query("select c from Consulta c where idMedico=:idMedico and fecha=:fecha")
	List<Consulta>listarConsultasPorMedicoYFecha(@Param("idMedico") Integer idMedico, @Param("fecha") String fecha);
	
	@Query("select c from Consulta c where idPaciente=:idPaciente")
	List<Consulta>listarConsultasPorPaciente(@Param("idPaciente") Integer idPaciente);
	
	@Query("select c from Consulta c where idPaciente=:idPaciente and fecha=:fecha")
	List<Consulta>listarConsultasPorPacienteYFecha(@Param("idPaciente") Integer idPaciente, @Param("fecha") String fecha);
	
}
