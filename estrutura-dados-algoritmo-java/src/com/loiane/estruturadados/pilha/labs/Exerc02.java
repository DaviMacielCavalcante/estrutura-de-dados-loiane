package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

public class Exerc02 {

	public static void main(String[] args) {
		
		Stack<Integer> stackPar = new Stack<Integer>();
		Stack<Integer> stackImpar = new Stack<Integer>();
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				stackPar.push(i);
			}
			else {
				if ((stackPar.isEmpty()) || stackImpar.isEmpty()) {
					System.out.println("Pilha vazia!");
				}
				stackImpar.push(i);
			}			
		}
	
		if (!(stackPar.isEmpty() && !(stackImpar.isEmpty()))) {
			while (stackPar.isEmpty() == false) {
				System.out.println(stackPar.pop());
			}
			while (stackImpar.isEmpty() == false) {
				System.out.println(stackImpar.pop());
			}
		}
	
	}
}
