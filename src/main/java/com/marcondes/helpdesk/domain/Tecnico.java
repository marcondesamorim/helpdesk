package com.marcondes.helpdesk.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tecnico extends Pessoa {

    public Tecnico() {
        super();
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }
}
