package Colecciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Palabras {
	HashMap<Integer, TreeSet<String>> mapa;

	public Palabras() {
		mapa = new HashMap<>();
	}

	public Palabras(String palabras) {
		this();
		añadirPalabras(palabras);
	}

	public void añadirPalabra(String palabra) {
		int l = palabra.length();
		TreeSet<String> palabras = mapa.get(l);
		if (palabras == null) {
			palabras = new TreeSet<>();
			mapa.put(l, palabras);
		}
		palabras.add(palabra);
	}

	public void añadirPalabras(String palabras) {
		for (String palabra : palabras.split("\\P{Alpha}"))
			añadirPalabra(palabra);
	}

	public boolean contiene(String palabra) {
		TreeSet<String> palabras = mapa.get(palabra.length());
		return palabras != null && palabras.contains(palabra);
	}

	public Set<String> getPalabras(int longitud) {
		Set<String> palabras = mapa.get(longitud);
		return palabras == null ? Collections.emptySet() : Collections.unmodifiableSet(mapa.get(palabras));
	}

	public static void main(String[] args) throws IOException {
		Palabras p = new Palabras();
//		p.añadirPalabras("palabra");
//		Set<String> palabras=p.getPalabras(7);
//		System.out.println(palabras);
		try (BufferedReader stdn = new BufferedReader(new FileReader("C:\\Users\\Lucia\\git\\repasojava\\repasojava\\res\\ElQuijote.txt"))) {
			String linea;
			while ((linea = stdn.readLine()) != null) {
				p.añadirPalabras(linea);
			}
		}
		System.out.println(p.getPalabras(5));
	}

}
