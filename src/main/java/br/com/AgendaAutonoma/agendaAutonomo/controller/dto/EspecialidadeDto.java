package br.com.AgendaAutonoma.agendaAutonomo.controller.dto;

import java.time.LocalDate;

public class EspecialidadeDto {
	
	private Long id;
	private String nomeEspecialidade;
	private String usuUltAlteracao;
	private LocalDate dataUltAlteracao;
	
	
	public LocalDate getDataUltAlteracao() {
		return dataUltAlteracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNome(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}
 
	public String getUsuUltAlteracao() {
		return usuUltAlteracao;
	}

	public void setUsuUltAlteracao(String usuUltAlteracao) {
		this.usuUltAlteracao = usuUltAlteracao;
	}
}
