package primitiva;

import java.util.*;

public class Primitiva {
	public TreeSet<Integer> miLista;
	Random random = new Random();

	Primitiva(TreeSet<Integer> miLista) {
		for (int i = 1; i <= 6; i++) {
			int numeros = random.nextInt(49) + 1;
			miLista.add(numeros);
		}
		this.miLista = miLista;

	}

	public TreeSet<Integer> getMiLista() {
		return miLista;
	}

	public int jugada(TreeSet<Integer> jugador) {
		int aciertos = 0;
		TreeSet<Integer> ganadora = getMiLista();

		for (Integer value : ganadora) {
			System.out.println("combinacion: " + value);
			for (Integer valor : jugador) {
				if (value.equals(valor)) {
					aciertos++;
					System.out.println("acertates el numero : " + value);
				}
			}
		}

		return aciertos;
	}

}
