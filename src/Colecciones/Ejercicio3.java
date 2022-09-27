package Colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader stdn = new BufferedReader(new InputStreamReader(System.in));
		Set <String> noSeRepiten = new HashSet<>();
		Set <String> seRepiten = new HashSet<>();
		System.out.println("> ");
		String linea = stdn.readLine();
		Scanner s = new Scanner(linea);
		s.useDelimiter("[^//p{Alpha}]+");
		while (s.hasNext()) {
			String palabra = s.next();
			if(!noSeRepiten.add(palabra)) {
				noSeRepiten.remove(palabra);
				seRepiten.add(palabra);
				}
			
		}
		System.out.printf("Las que no se repiten: %s", noSeRepiten);
		System.out.printf("Las que se repiten: %s", seRepiten);
		s.close();
	}

}
