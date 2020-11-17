package io.topi.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;



@Controller
public class BuscaApiGitController {
	
	
	
	@RequestMapping(value = "/buscar")	
	public String novo() {		
					
		 return "BuscaGitApi";
		
		
	
	}
	
@RequestMapping(value = "/listar")
public String Pesquisar() {
	
	
	return "ResultadoGit";
	
	
}
		

}