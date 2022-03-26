package com.marcondes.helpdesk.repository;

import com.marcondes.helpdesk.domain.Tecnico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}