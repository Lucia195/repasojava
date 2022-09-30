package Colecciones;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		Queue <Integer> numeros = new LinkedList<Integer>();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introdue 3 números: ");
		int N = teclado.nextInt();
		int K= teclado.nextInt();
		int X= teclado.nextInt();
		System.out.println("Introduce números: ");
		int n2 = teclado.nextInt();
		numeros.add(n2);
		boolean opcion;
		while (teclado.hasNext()) {
			if (numeros.peek()==K) {
				numeros.remove();
			}
		}
		int menor=1000000000;
		for (int i = 0; i < numeros.size(); i++) {
			if(numeros.peek()==X) {
				opcion = true;
				System.out.println(opcion);
			}else {
				if (menor>numeros.peek()) {
					menor = numeros.peek();
				}
			}
			
		}
		System.out.println(menor);
		teclado.close();
	}

}
