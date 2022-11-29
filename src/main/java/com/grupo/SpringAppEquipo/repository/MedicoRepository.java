package com.grupo.SpringAppEquipo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grupo.SpringAppEquipo.entity.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
}
