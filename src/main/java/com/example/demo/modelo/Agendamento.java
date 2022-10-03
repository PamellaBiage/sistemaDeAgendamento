package com.example.demo.modelo;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Agendamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeDoTutor;
	private String nomeDoPet;
	private String especie;
	private String servicos;
	private Double valor;
	private String observacao;
	
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private LocalDate dataAgendamento;
	
	@Enumerated(EnumType.STRING)
	private StatusAgendamento status;
		
	public String getNomeDoTutor() {
		return nomeDoTutor;
	}
	public void setNomeDoTutor(String nomeDoTutor) {
		this.nomeDoTutor = nomeDoTutor;
	}
	public String getNomeDoPet() {
		return nomeDoPet;
	}
	public void setNomeDoPet(String nomeDoPet) {
		this.nomeDoPet = nomeDoPet;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getServicos() {
		return servicos;
	}
	public void setServicos(String servicos) {
		this.servicos = servicos;
	}
	
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public StatusAgendamento getStatus() {
		return status;
	}
	public void setStatus(StatusAgendamento status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
		
}
