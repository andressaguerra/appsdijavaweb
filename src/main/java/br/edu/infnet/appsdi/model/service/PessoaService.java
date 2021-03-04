package br.edu.infnet.appsdi.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appsdi.model.negocio.Pessoa;
import br.edu.infnet.appsdi.model.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void incluir(Pessoa pessoa) {
		
		pessoaRepository.incluir(pessoa);
	}
	
	public String obterStatus(Pessoa pessoa) {
		
		if(pessoa.calcularSalarioAnual() > 50000) {
			return pessoa.getNome() + ", que pessoa rica!";
		}
		
		return "Poxa, " + pessoa.getNome() + "! Tá difícil, né?!";
	}
}
