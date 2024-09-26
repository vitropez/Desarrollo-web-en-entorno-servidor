package hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lowcost extends Habitacion {
	private static int numeroDePlazas = 3;

	public Lowcost(String clase, int precio, String libreOcupada, long tiempo) {
		this.clase = clase;
		this.precio = precio;
		this.libreOcupada = libreOcupada;
		this.tiempo = tiempo;

	}

	public static int getNumeroDePlazas() {
		return numeroDePlazas;
	}

	@Override
	public void checkin(Habitacion miHabitacion) {

		if (miHabitacion.getLibreOcupada().equals("libre")) {
			miHabitacion.setLibreOcupada("ocupada");
			Date fecha = new Date(1490161712000L);
			long dias = fecha.getTime();
			miHabitacion.setTiempo(dias);
			DateFormat simple = new SimpleDateFormat("dd MMM yyyy ");
			System.out.println(simple.format(fecha.getTime()));
		} else {
			System.out.println("la habitacion est� ocupada");
		}

	}

	@Override
	public void checkout(Habitacion miHabitacion) {
		System.out.println(miHabitacion);
		System.out.println(miHabitacion.getPrecio());
		if (miHabitacion.getLibreOcupada().equals("ocupada")) {
			long fechaDeRegistro = miHabitacion.getTiempo();

			miHabitacion.setLibreOcupada("libre");
			Date fecha = new Date();
			long dias = fecha.getTime();

			long tiempoDeEstancia = dias - fechaDeRegistro;

			int estancia = (int) (tiempoDeEstancia / (1000 * 60 * 60 * 24));

			int tarifa = estancia * (miHabitacion.getPrecio());
			System.out.println(tarifa);

			miHabitacion.setTiempo(0);
			System.out.println("la factura es: " + tarifa + " euros");
		} else {
			System.out.println("la habitaci�n no est� ocupada");
		}

	}
}
