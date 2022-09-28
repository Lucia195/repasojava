package Colecciones2;

import java.util.Deque;
import java.util.LinkedList;

public class Colecciones {

	public static void main(String[] args) {
		Deque<Integer> pila = new LinkedList<>();
		pila.push(6);
		pila.push(22);
		pila.push(17);
		pila.push(17);
		pila.push(10);
		pila.push(7);
		pila.push(9);
		pila.push(14);
		pila.push(5);
		pila.push(12);
		pila.push(7);
		pila.push(2);
		eliminarSiMayoresEncima(pila);
		System.out.println(pila);
	}

	public static void eliminarSiMayoresEncima(Deque<Integer> pila) {
		LinkedList<Integer> pila2 = new LinkedList<>();
		while (!pila.isEmpty()) {
			int n = pila.poll();
			if (pila2.isEmpty() || n >= pila2.peek()) {
				pila2.push(n);
			}
		}
		do {
			pila.push(pila2.poll());
		} while (!pila2.isEmpty());
	}

}
