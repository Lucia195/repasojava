package Colecciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
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

	public void añadirPalabra(String palabra) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Lucia\\ElQuijote.txt"));
	}

	public void añadirPalabras(String palabras) {

	}

	public static void main(String[] args) {
		Palabras p = new Palabras();
		
	}

}
