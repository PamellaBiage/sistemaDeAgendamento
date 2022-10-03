package com.example.demo.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.RequisicaoNovoAgendamento;
import com.example.demo.modelo.Agendamento;
import com.example.demo.repository.AgendamentoRepository;

@Controller
@RequestMapping("agendamento")
public class AgendamentoController {

	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	@GetMapping("formulario")
	public String formulario(RequisicaoNovoAgendamento requisicao) {
		return "agendamento/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid  RequisicaoNovoAgendamento requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "agendamento/formulario";
		}
		
		Agendamento agendamento = requisicao.toAgendamento();
		agendamentoRepository.save(agendamento);
		
		return "redirect:/inicio";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam Long id) {
		agendamentoRepository.deleteById(id);
		return "redirect:/inicio";
	}
}
