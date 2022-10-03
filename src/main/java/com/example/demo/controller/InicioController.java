package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.modelo.Agendamento;
import com.example.demo.repository.AgendamentoRepository;

@Controller
public class InicioController {
	
	@Autowired
	private AgendamentoRepository pedidoRepository;
	
	@GetMapping("/inicio")
	public String inicio(Model model) {
		List<Agendamento> agendamentos = pedidoRepository.findAll();
		model.addAttribute("agendamentos", agendamentos);
		
		return "inicio";
	}
	


}
