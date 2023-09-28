package com.generation.metasemanal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meta-semanal")
public class MetaSemanalController {
	
	@GetMapping
	public String metasemanal() {
		return "Aprimorar o planejmaento para as etapas iniciais do PorjetoIntegrador";
	}

}
