package hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

abstract class Habitacion {
	protected String clase;
	protected  int precio;
	protected String libreOcupada;
	protected long tiempo;

	public Habitacion() {
	}

	public Habitacion(String clase, int precio, String libreOcupada, long tiempo) {
		this.clase = clase;
		this.precio = precio;
		this.libreOcupada = libreOcupada;
		this.tiempo = tiempo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getLibreOcupada() {
		return libreOcupada;
	}

	public void setLibreOcupada(String libreOcupada) {
		this.libreOcupada = libreOcupada;
	}

	public long getTiempo() {
		return tiempo;
	}

	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}

	 public String getClase() {
		 return clase;
	 }

	public void setClase(String clase) {
		this.clase = clase;
	}
	abstract public void checkin(Habitacion miHabitacion);
	abstract public void checkout(Habitacion miHabitacion);


	@Override
	public String toString() {
		return "Habitacion clase:" + clase + ", precio:" + precio + ", disponibilida:" + libreOcupada + ", tiempo="
				+ tiempo + " ";
	}

}
