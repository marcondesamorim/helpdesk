package com.marcondes.helpdesk.domain.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.marcondes.helpdesk.domain.Tecnico;
import com.marcondes.helpdesk.domain.enums.Perfil;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TecnicoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	protected Integer id;
	@NotNull(message = "O campo NOME é requerido")
	protected String nome;
	@NotNull(message = "O campo CPF é requerido")
	@CPF
	protected String cpf;
	@NotNull(message = "O campo EMAIL é requerido")
	protected String email;
	@NotNull(message = "O campo SENHA é requerido")
	protected String senha;
	protected Set<Integer> perfis = new HashSet<>();

	@JsonFormat(pattern = "dd/MM/yyyy")
	protected LocalDate dataCriacao = LocalDate.now();

	public TecnicoDTO() {
		super();
		addPerfil(Perfil.CLIENTE);
	}

	public TecnicoDTO(Tecnico obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cpf = obj.getCpf();
		this.email = obj.getEmail();
		this.senha = obj.getSenha();
		this.perfis = obj.getPerfis().stream().map(x -> x.getCodigo()).collect(Collectors.toSet());
		this.dataCriacao = obj.getDataCriacao();
		addPerfil(Perfil.TECNICO);
	}

	public Set<Perfil> getPerfis() {
		return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
	}

	public void addPerfil(Perfil perfil) {
		if (!this.perfis.contains(perfil.getCodigo()))
			this.perfis.add(perfil.getCodigo());
	}
}
