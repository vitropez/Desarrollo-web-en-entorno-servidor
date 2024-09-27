package domotico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Domotico> edificio;
		edificio = new ArrayList<>();
		edificio.add(new Ascensor());
		edificio.add(new Termostato());
		edificio.add(new Radio());
		Scanner sc = new Scanner(System.in);
		int eleccion = 1;
		do {

			System.out.println("Selecciona una opción:" + "\n0: Salir," + "\n1: subir un dispositivo,"
					+ "\n2: bajar un dispositivo," + "\n3: resetear un dispositivo," + "\n4: revisar termostato");
			eleccion = sc.nextInt();

			Scanner sb = new Scanner(System.in);
			System.out.println("Elige el aparato:" + "\n0: ascensor," + "\n1: termostato," + "\n2: radio,");
			int dispositivo = sb.nextInt();

			switch (eleccion) {
			case (1):

				boolean subir = edificio.get(dispositivo).subir();
				System.out.println(edificio.get(dispositivo).verEstado());
				if (!subir)
					System.out.println("el dispositivo está al máximo");
				break;
			case (2):
				boolean bajar = edificio.get(dispositivo).bajar();
				System.out.println(edificio.get(dispositivo).verEstado());
				if (!bajar)
					System.out.println("el dispositivo está al minimo");
				break;
			case (3):
				edificio.get(dispositivo).reset();
				System.out.println(edificio.get(dispositivo).verEstado());
				break;
			case (4):
				Termostato.revisar();
				System.out.println(edificio.get(dispositivo).verEstado());
			}

		} while (eleccion != 0);
	}

}
