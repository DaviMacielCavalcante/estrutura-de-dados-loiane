package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula10 {

	public static void main(String[] args) {
	
		Vetor vetor = new Vetor(3);

		
		vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);				
		
		System.out.println(vetor);	
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		int pos = (int) vetor.busca(1);
		
		if (pos > -1) {
			vetor.remove(pos);
		}
		
		System.out.println(vetor);
	}

}
