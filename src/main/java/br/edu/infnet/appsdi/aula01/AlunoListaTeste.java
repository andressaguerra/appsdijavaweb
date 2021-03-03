package br.edu.infnet.appsdi.aula01;

import java.util.ArrayList;
import java.util.List;

public class AlunoListaTeste {
	
	public static void main(String[] args) {
		
		String[] nomes = {"Andressa", "Luane", "Gabriel"};
		String[] emails = {"and@email.com", "lua@email.com", "gab@email.com"};
	
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int i = 0; i < nomes.length; i++) {	
			Aluno aluno = new Aluno();
			
			aluno.setId(i + 1);
			aluno.setNome(nomes[i]);
			aluno.setEmail(emails[i]);
			
			alunos.add(aluno);
		}
		
		for (Aluno a : alunos) {
			System.out.println(a);
		}
	}

}
