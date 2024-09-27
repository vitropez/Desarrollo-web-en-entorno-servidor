package domotico;

public class Radio implements Domotico {
	private double dial;
	private static final double MIN = 88.0;
	private static final double MAX = 104.0;
	private final static double INIT = MIN;

	public Radio() {
		this.dial = INIT;
	}

	@Override
	public boolean subir() {

		if ((dial + 0.1) > MAX)
			return false;
		dial++;
		return true;
	}

	@Override
	public boolean bajar() {
		if ((dial - 0.1) < MIN)
			return false;
		dial--;
		return true;

	}

	@Override
	public void reset() {
		dial = INIT;

	}

	@Override
	public String verEstado() {
		return "La Radio está en el dial " + dial;

	}

	@Override
	public String toString() {
		return "Radio [dial=" + dial + "]";
	}

}
