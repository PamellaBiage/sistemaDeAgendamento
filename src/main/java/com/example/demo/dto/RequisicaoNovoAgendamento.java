package com.example.demo.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import com.example.demo.modelo.Agendamento;
import com.example.demo.modelo.StatusAgendamento;

public class RequisicaoNovoAgendamento {
	
	@NotBlank
	private String nomeDoTutor;
	@NotBlank
	private String nomeDoPet;
	@NotBlank
	private String servicos;

	private Double valor;
	@NotBlank
	private String especie;
	
	private String observacao;
	
	private LocalDate dataAgendamento;
	private String dataTexto;
	
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
	public String getServicos() {
		return servicos;
	}
	public void setServicos(String servicos) {
		this.servicos = servicos;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
	
	public String getDataTexto() {
		return dataTexto;
	}
	public void setDataTexto(String dataTexto) {
		this.dataTexto = dataTexto;
	}
	
	
	public Agendamento toAgendamento() {
		Agendamento agendamento = new Agendamento();
		agendamento.setNomeDoTutor(nomeDoTutor);
		agendamento.setNomeDoPet(nomeDoPet);
		agendamento.setServicos(servicos);
		agendamento.setEspecie(especie);
		agendamento.setObservacao(observacao);
		agendamento.setValor(valor);
		agendamento.setStatus(StatusAgendamento.AGENDADOS);
		agendamento.setDataAgendamento(LocalDate.parse(dataTexto));
		
		return agendamento;
	}




}
