package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

public class Exerc01 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				stack.push(i);
			}
			else {
				if (stack.isEmpty()) {
					System.out.println("Pilha vazia!");
				}
				stack.pop();
			}			
		}
		System.out.println(stack);
		if (!(stack.isEmpty())) {
			while (stack.isEmpty() == false) {
				System.out.println(stack.pop());
			}			
		}
		
		System.out.println(stack);
	}
}
