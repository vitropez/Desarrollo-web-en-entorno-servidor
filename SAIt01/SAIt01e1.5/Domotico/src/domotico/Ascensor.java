package domotico;

public class Ascensor implements Domotico {
	private int planta;
	private final static int MIN = 0;
	private final static int MAX = 8;
	private final static int INIT = 0;

	public Ascensor() {
		this.planta = INIT;
	}

	@Override
	public boolean subir() {

		if ((planta + 1) > MAX)
			return false;
		planta++;
		return true;

	}

	@Override
	public boolean bajar() {
		if ((planta - 1) < MIN)
			return false;
		planta--;
		return true;

	}

	@Override
	public void reset() {
		planta = INIT;
	}

	@Override
	public String verEstado() {

		return "El Ascensor está en la planta " + planta;
	}

	@Override
	public String toString() {
		return "Ascensor [planta=" + planta + "]";
	}

}
