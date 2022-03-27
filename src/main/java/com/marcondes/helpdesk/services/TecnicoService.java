package com.marcondes.helpdesk.services;

import java.util.Optional;

import com.marcondes.helpdesk.domain.Tecnico;
import com.marcondes.helpdesk.repository.TecnicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository repository;

    public Tecnico findById(Integer id) {
        Optional<Tecnico> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
