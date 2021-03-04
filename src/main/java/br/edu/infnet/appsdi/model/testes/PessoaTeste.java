package br.edu.infnet.appsdi.model.testes;

import br.edu.infnet.appsdi.model.negocio.Pessoa;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa and = new Pessoa();
		and.setId(1);
		and.setNome("Andressa Guerra");
		and.setEmail("and@email.com");
		and.setSalario(3000);
		and.setQtdeMeses(24);
		System.out.println(and);
		
		Pessoa lua = new Pessoa("Luane Guerra", "lua@email.com");
		lua.setId(2);
		lua.setSalario(2000);
		lua.setQtdeMeses(19);
		System.out.println(lua);
		
		Pessoa gab = new Pessoa("Gabriel Guerra", "gab@email.com", 1000, 13);
		gab.setId(3);
		System.out.println(gab);
	}

}
