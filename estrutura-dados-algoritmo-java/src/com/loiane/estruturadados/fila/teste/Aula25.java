package com.loiane.estruturadados.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new PriorityQueue<>();
		
		fila.add(6);
		fila.add(8);
		fila.add(4);
		fila.add(1);
		fila.add(3);
		fila.add(2);
		
		System.out.println(fila);	
		
		fila.remove();
		
		System.out.println(fila);
	}

}
