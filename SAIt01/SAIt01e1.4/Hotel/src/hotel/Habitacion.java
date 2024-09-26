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
	static public void checkin(Habitacion miHabitacion) {
		System.out.println(miHabitacion);
		System.out.println(miHabitacion.getClase());
		System.out.println(miHabitacion.getPrecio());
		if(miHabitacion.getLibreOcupada().equals("libre")) {
			miHabitacion.setLibreOcupada("ocupada");
			Date fecha = new Date(1490161712000L);
			long dias = fecha.getTime();
			miHabitacion.setTiempo(dias);
		    DateFormat simple = new SimpleDateFormat("dd MMM yyyy ");
			System.out.println(simple.format(fecha.getTime()));
		}
		else {
			System.out.println("la habitacion está ocupada");
		}
		
	}
	static public void checkout(Habitacion miHabitacion) {
		System.out.println(miHabitacion);
		System.out.println(miHabitacion.getPrecio());
		if(miHabitacion.getLibreOcupada().equals("ocupada")) {
			long fechaDeRegistro=miHabitacion.getTiempo();
			
			miHabitacion.setLibreOcupada("libre");
			Date fecha = new Date();
			long dias = fecha.getTime();
			
			long tiempoDeEstancia=dias-fechaDeRegistro;
			
			int estancia = (int) (tiempoDeEstancia /  (1000*60*60*24));
			
			int tarifa=estancia*(miHabitacion.getPrecio());
			System.out.println(tarifa);
			
			miHabitacion.setTiempo(0);
			System.out.println("la factura es: "+tarifa+" euros");
		}
		else {
			System.out.println("la habitación no está ocupada");
		}
		
	}


	@Override
	public String toString() {
		return "Habitacion clase:" + clase + ", precio:" + precio + ", libreOcupada:" + libreOcupada + ", tiempo="
				+ tiempo + " ";
	}

}
