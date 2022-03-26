package com.marcondes.helpdesk.repository;

import com.marcondes.helpdesk.domain.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}