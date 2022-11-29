package com.grupo.SpringAppEquipo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.grupo.SpringAppEquipo.entity.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
	@Query("Select m from Medico m where nombreCompleto=:nombre")
	Medico findByName(@Param("nombre") String nombre);
}
