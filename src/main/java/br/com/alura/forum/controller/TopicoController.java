package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

@RestController
public class TopicoController {

	@RequestMapping("/topicos")
	public List<Topico> getTopicos() {
		Topico topico = new Topico("Duvida", "Duvida sobre Spring Boot", new Curso("Spring Boot", "Backend"));
		return Arrays.asList(topico, topico, topico);
	}
	
}
