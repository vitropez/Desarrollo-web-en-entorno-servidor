package primitiva;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class Principal {
	static TreeSet<Integer> lista;

	public static void main(String[] args) throws IOException {

		TreeSet<Integer> listaGanadora = new TreeSet<>();
		Primitiva miGanador = new Primitiva(listaGanadora);

		try {
			crearLista();

		} catch (Exception e) {
			System.out.print("el dato introducido no es correcto \n");
			crearLista();
		}

		int gane = 0;

		gane = miGanador.jugada(lista);

		System.out.println("HAS ACERTADO "+gane+" NUMEROS");

	}

	static void crearLista() {
		lista = new TreeSet<>();
		lista.removeAll(lista);
		Scanner sc = new Scanner(System.in);
		try {
			for (int i = 1; i <= 6; i++) {
				System.out.println("introduce un numero");

				Integer numero = sc.nextInt();

				if ((numero instanceof Integer) && (numero > 0) && (numero < 50)) {
					for (Integer value : lista) {
						if (numero == value) {
							throw new InputMismatchException("el dato introducido no es correcto \n");
						}
					}
					lista.add(numero);
				} else {
					throw new InputMismatchException("el dato introducido no es correcto \n");

				}

			}
		} catch (Exception e) {
			System.out.print("el dato introducido no es correcto \n");
			crearLista();
		}

	}

}
