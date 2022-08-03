package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>(15);
		
		System.out.println(pilha.estaVazia());
		
		for (int i = 1; i <= 10; i++) {
			pilha.empilha(i);
		}		
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		System.out.println(pilha.estaVazia());
		System.out.println(pilha.topo());
		
	}

}
