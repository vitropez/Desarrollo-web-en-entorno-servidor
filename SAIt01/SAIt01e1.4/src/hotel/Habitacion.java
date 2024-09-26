package hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

abstract class Habitacion {
	protected String clase;
	protected int precio;
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
	static public String checkin(Habitacion miHabitacion) {
		System.out.println(miHabitacion);
		
			miHabitacion.setLibreOcupada("ocupada");
			Date fecha = new Date(1599567400L);
			long dias = fecha.getTime();
			miHabitacion.setTiempo(dias);
		    DateFormat simple = new SimpleDateFormat("dd MMM yyyy ");
			System.out.println(simple.format(fecha.getTime()));
	
		return "HABITACION OCUPADA";
	}
	static public String checkout(Habitacion miHabitacion) {
		System.out.println(miHabitacion);
			long fechaDeRegistro=miHabitacion.getTiempo();
			System.out.println(fechaDeRegistro);
			miHabitacion.setLibreOcupada("libre");
			Date fecha = new Date();
			long dias = fecha.getTime();
			System.out.println(dias);
			long tiempoDeEstancia=dias-fechaDeRegistro;
			
			int estancia = (int) (tiempoDeEstancia /  (1000*60*60*24));
			System.out.println(estancia);
			miHabitacion.setTiempo(0);
		   
		return "HABITACION OCUPADA";
	}


	@Override
	public String toString() {
		return "Habitacion clase=" + clase + ", precio=" + precio + ", libreOcupada=" + libreOcupada + ", tiempo="
				+ tiempo + " ";
	}

}
