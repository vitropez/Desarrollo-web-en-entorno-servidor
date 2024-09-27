package domotico;

import java.util.Date;

public class Termostato implements Domotico {
	private int temperatura;
	private static final int MIN = 15;
	private static final int MAX = 80;
	private final static int INIT = 20;
	private static Date fechaRevision;

	public Termostato() {
		this.temperatura = INIT;
	}

	@Override
	public boolean subir() {
		if ((temperatura + 1) > MAX)
			return false;
		temperatura++;
		return true;
	}

	@Override
	public boolean bajar() {
		if ((temperatura - 1) < MIN)
			return false;
		temperatura--;
		return true;

	}

	@Override
	public void reset() {
		temperatura = INIT;
	}

	@Override
	public String verEstado() {

		return "El Termostato tiene una temperatura de " + temperatura + "grados" + " fecha última revisión: "
				+ fechaRevision;
	}

	static public void revisar() {
		fechaRevision = new Date();
	}

	@Override
	public String toString() {
		return "Termostato [temperatura=" + temperatura + "]";
	}

}
