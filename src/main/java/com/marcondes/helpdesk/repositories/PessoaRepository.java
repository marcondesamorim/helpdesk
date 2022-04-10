package com.marcondes.helpdesk.repositories;

import java.util.Optional;

import com.marcondes.helpdesk.domain.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    Optional<Pessoa> findByCpf(String cpf);

    Optional<Pessoa> findByEmail(String email);
}