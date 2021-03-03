package br.edu.infnet.appsdi.aula01;

import java.util.HashMap;
import java.util.Map;

public class AlunoMapaTeste {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
		
		mapaNomes.put(1, "andressa");
		mapaNomes.put(2, "luane");
		System.out.println(mapaNomes);
		
		mapaNomes.put(2, "gabriel");
		System.out.println(mapaNomes);
		
		mapaNomes.remove(2);
		System.out.println(mapaNomes);
	}
}
