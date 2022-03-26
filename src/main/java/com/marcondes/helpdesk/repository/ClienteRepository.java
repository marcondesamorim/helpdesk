package com.marcondes.helpdesk.repository;

import com.marcondes.helpdesk.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}