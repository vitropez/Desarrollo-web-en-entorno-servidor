package cadena;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Cadena {
	static Map<Character, Integer> mapaContador = new TreeMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String cadena = sc.next();

		int cantVecesLetraActual;
		for (int i = 0; i < cadena.length(); i++) {

			char letraActual = cadena.charAt(i);

			cantVecesLetraActual = mapaContador.getOrDefault(letraActual, 0) + 1;

			mapaContador.put(letraActual, cantVecesLetraActual);
		}
		for (Map.Entry<Character, Integer> entrada : mapaContador.entrySet()) {

			System.out.print(entrada.getKey() + "=" + entrada.getValue() + ",");

		}

	}

}
