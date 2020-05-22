package com.superagregador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;



@Controller
public class ApplicationController {
	@GetMapping("/")
	public String home(@CookieValue(value = "nome", required=false, defaultValue = "Usuário Desconhecido") String nome,
	Model model) {
		model.addAttribute("nome", nome);
		return "index";
	}

	@GetMapping("/sobre")
	public String sobre(Model model) {
		return "sobre";
	}

	@PostMapping("/AdicionarSite")
	public String adicionarSite(@RequestParam(value = "url", required = true, defaultValue = "") String URL, Model model) {
		model.addAttribute("valorURL", URL);
		return "index";
	}

	@GetMapping(value ="/login")
	public String login(Model model){
        return "login";
	}

}
