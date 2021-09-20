package com.example.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.forum.controller.dto.TopicoDto;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController 
{
	@RequestMapping("/topicos")
	public List<TopicoDto> lista()
	{
		Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring","Programação"));
		
		return TopicoDto.Converter(Arrays.asList(topico, topico, topico));
	}
}
 