package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {

	@GetMapping @RequestMapping("/hello-world") 
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("/bsm")
	public String bsm(){
		return "Mentalidades:\n"
				+ "Orientação ao futuro\n"
				+ "Responsabilidade Pessoal\n"
				+ "Mentalidade de crescimento\n"
				+ "Persistência\n"
				+ "Habilidade:\n"
				+ "Trabalho em equipe\n"
				+ "Atenção aos detalhes\n"
				+ "Proatividade\n"
				+ "Comunicação";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return  "Fazer os exercícios pós aula\n"
				+ "Consertar os codigos quebrados\n"
				+ "Me organizar melhor";
				
	}
}
