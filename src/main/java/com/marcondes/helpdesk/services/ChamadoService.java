package com.marcondes.helpdesk.services;

import java.util.List;
import java.util.Optional;

import com.marcondes.helpdesk.domain.Chamado;
import com.marcondes.helpdesk.repository.ChamadoRepository;
import com.marcondes.helpdesk.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository repository;

    public Chamado findById(Integer id) {
        Optional<Chamado> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
    }

    public List<Chamado> findAll() {
        return repository.findAll();
    }
}
