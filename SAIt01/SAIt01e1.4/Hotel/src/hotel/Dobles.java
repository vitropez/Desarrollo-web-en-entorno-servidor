package hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dobles extends Habitacion {
	private static int numeroDePlazas = 10;

	public Dobles(String clase, int precio, String libreOcupada, int tiempo) {
		this.clase = clase;
		this.precio = precio;
		this.libreOcupada = libreOcupada;
		this.tiempo = tiempo;

	}

	public static void setNumeroDePlazas(int numeroDePlazas) {
		Dobles.numeroDePlazas = numeroDePlazas;
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

		} else {
			System.out.println("la habitacion está ocupada");
		}

	}

	@Override
	public void checkout(Habitacion miHabitacion) {

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
			DateFormat simple = new SimpleDateFormat("dd MMM yyyy ");
			String mes = simple.format(fecha.getTime());
			if (mes.contains("abril") || mes.contains("agosto") || mes.contains("julio")) {
				Double tarifaConPlus = tarifa * (1.20);
				System.out.println("la factura es: " + tarifaConPlus + " euros");
			} else {
				System.out.println("la factura es: " + tarifa + " euros");
			}
		} else {
			System.out.println("la habitación no está ocupada");
		}

	}

}
