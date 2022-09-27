package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		añadirLista(numeros);
		mostrarLista(numeros);

		LinkedHashSet<Integer> numeros2 = new LinkedHashSet<>(numeros);
		Iterator<Integer> it = numeros2.iterator();
		System.out.println("LISTAAAA");
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		TreeSet<Integer> numeros3 = new TreeSet<>(numeros);
		Iterator<Integer> up = numeros.iterator();
		System.out.println("LISTAAAA");
		while (up.hasNext()) {
			System.out.println(up.next());
		}
	}

	private static void mostrarLista(ArrayList<Integer> numeros) {
//		for (int i = 0; i < numeros.size(); i++) {
//			System.out.println(numeros.get(i));
//		}
		numeros.forEach((nombre) -> System.out.println(nombre));

	}

	private static void añadirLista(ArrayList<Integer> numeros) {
		for (int i = 0; i < 100; i++) {
			numeros.add((int) Math.round(Math.random() * 99 + 1));

		}
	}

}
