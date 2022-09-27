package Colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		LinkedHashSet<String> nombres = new LinkedHashSet<>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Introduce el número de nombres que vas a introducir");
		num = Integer.parseInt(in.readLine());
		for (int i = 0; i < num; i++) {
			System.out.println("Introduce un nombre");
			String nombre = in.readLine();
			nombres.add(nombre);
		}
		System.out.println(nombres);
	}

}
