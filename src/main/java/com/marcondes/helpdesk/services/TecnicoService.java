package com.marcondes.helpdesk.services;

import java.util.List;
import java.util.Optional;

import com.marcondes.helpdesk.domain.Tecnico;
import com.marcondes.helpdesk.domain.dtos.TecnicoDTO;
import com.marcondes.helpdesk.repository.TecnicoRepository;
import com.marcondes.helpdesk.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository repository;

    public Tecnico findById(Integer id) {
        Optional<Tecnico> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
    }

    public List<Tecnico> findAll() {
        return repository.findAll();
    }

    public Tecnico create(TecnicoDTO objDTO) {
        objDTO.setId(null);
        Tecnico newObj = new Tecnico(objDTO);
        return repository.save(newObj);
    }
}
