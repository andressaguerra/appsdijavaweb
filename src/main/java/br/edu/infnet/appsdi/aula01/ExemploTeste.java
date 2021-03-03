package br.edu.infnet.appsdi.aula01;

public class ExemploTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setId(1);
		aluno.setNome("Andressa Guerra");
		aluno.setEmail("andressa.guerra@al.infnet.edu.br");
		System.out.println(aluno);
	}

}
