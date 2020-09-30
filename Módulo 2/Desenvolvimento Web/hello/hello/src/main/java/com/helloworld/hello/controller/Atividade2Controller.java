package com.helloworld.hello.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Atividade2")
public class Atividade2Controller {
	
	@GetMapping
	public String Objetivos (){
		return "Tenho como objetivo para esta semana aprender mais sobre as ferramentas para desenvolvimento Web.";
	}
}

