package persona;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Persona> misCLientes = new ArrayList<Persona>();
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("introduce el dni");
			String dni = sc.nextLine();
			System.out.println("introduce el nombre");
			String name = sc.nextLine();
			System.out.println("introduce la edad");
			int age = Integer.parseInt(sc.nextLine());
			Persona cliente = new Persona(dni, name, age);

			ArrayList<Integer> mishash = new ArrayList<Integer>();

			misCLientes.add(cliente);

			Object[] miArray;

			Iterator<Persona> miIterator = misCLientes.iterator();

			while (miIterator.hasNext()) {
				int cliente1Hash = miIterator.next().getDni().hashCode();

				mishash.add(cliente1Hash);
			}

			miArray = mishash.toArray();
			if (misCLientes.size() > 1) {
				for (int i = 0; i <= misCLientes.size(); i++) {
					for (int j = i + 1; j < misCLientes.size(); j++) {
						if (miArray[i].equals(miArray[j])) {
							System.out.println("usuatio repetido; introduce el dni de nuevo");
							misCLientes.remove(cliente);

						}
					}
				}
			}

		} while (misCLientes.size() <= 5);

		// TODO Auto-generated method stub

		System.out.println("La edad mayor es de "+devuelveEdadMayor(misCLientes)+" años");
		System.out.println("La edad media de mis clientes es de "+devuelveEdadMedia(misCLientes)+" años");

	}

	public static int devuelveEdadMayor(ArrayList elArray) {
		List<Integer> miMayor = new ArrayList<Integer>();
		Iterator<Persona> miIterator2 = elArray.iterator();
		while (miIterator2.hasNext()) {

			int miEdad = miIterator2.next().getEdad();
			miMayor.add(miEdad);
		}

		int mayor = Collections.max(miMayor);
		nombreMayor(elArray, mayor);
		return mayor;

	}

	public static float devuelveEdadMedia(ArrayList<Persona> elArray) {
		int sum = 0;
		for (Persona n : elArray) {
			sum += (n.getEdad());
		}
		float media = sum / (elArray.size());
		mayoresDeEdad(elArray, media);
		return media;

	}

	public static void nombreMayor(ArrayList<Persona> elArray, int elMayor) {
		for (Persona n : elArray) {
			if (n.getEdad() == elMayor) {
				System.out.println("el nombre de la persona con mayor edad se llama "+n.getNombre());
				System.out.println("tiene la edad más avanzada "+n.toString());
			}

		}
	}

	public static void mayoresDeEdad(ArrayList<Persona> elArray, float laMedia) {
		for (Persona n : elArray) {
			if (n.getEdad() >= 18) {
				System.out.println( " es mayor de edad "+n.toString());
			}
			if (n.getEdad() > laMedia) {
				System.out.println("tiene una edad superior a la media "+n.toString());
			}
		}
	}

}
