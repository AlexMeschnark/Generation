package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Atividade1")
public class Atividade1Controller {
	
	@GetMapping
	public String HabMent(){
		return "Utilizei essas habilidades e mentalidades: persistência e atenção aos detalhes.";
	}
}
