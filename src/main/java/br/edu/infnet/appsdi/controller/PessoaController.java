package br.edu.infnet.appsdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appsdi.model.negocio.Pessoa;
import br.edu.infnet.appsdi.model.service.PessoaService;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping(value = "/pessoa/incluir")
	public String incluir(Pessoa pessoa) {
		
		System.out.println(pessoaService.obterStatus(pessoa));
		
		pessoaService.incluir(pessoa);
		
		return "redirect:/";
	}

}
