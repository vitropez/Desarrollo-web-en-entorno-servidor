package hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Hotel {
	
	static ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
	static ArrayList<Habitacion> habitacionesD = new ArrayList<Habitacion>();
	static ArrayList<Habitacion> habitacionesS = new ArrayList<Habitacion>();
	static ArrayList<Habitacion> habitacionesL = new ArrayList<Habitacion>();

	public static void main(String[] args) {
		

		for (int i = 0; i < Dobles.getNumeroDePlazas(); i++) {
			Habitacion miDoble = new Dobles("Doble", 100, "libre", 0);
			habitaciones.add(miDoble);

		}
		for (int i = 0; i < Suite.getNumeroDePlazas(); i++) {
			Habitacion miSuite = new Suite("Suite", 200, "libre", 0);
			habitaciones.add(miSuite);
		}
		for (int i = 0; i < Lowcost.getNumeroDePlazas(); i++) {
			Habitacion miLowcost = new Lowcost("Lowcost", 50, "Ocupada", 0);
			habitaciones.add(miLowcost);

		}
		 int miEleccion=menu();
		do {
			
		switch(miEleccion) {
		case 1:
			Scanner sa=new Scanner(System.in);
			System.out.println("elige la habitacion que desees de la 1 a la 18");
			int elegido=sa.nextInt();
			
			Habitacion eleccion=habitaciones.get(elegido);
			
			Habitacion.checkin(eleccion);
			 miEleccion=menu();
			break;
		case 2:
			Scanner sb=new Scanner(System.in);
			System.out.println("elige la habitacion que desees de la 1 a la 18");
			int elegido2=sb.nextInt();
			
			Habitacion eleccion2=habitaciones.get(elegido2);
			
			Habitacion.checkout(eleccion2);
			 miEleccion=menu();
			break;
		case 3:
			verHotel();
			 miEleccion=menu();
			break;
			
			
			
		}
		}while(miEleccion!=4);
		
	}

	static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una opción:\n 1-check-in.\n 2-check-out.\n 3-ver las habitaciones del hotel. \n 4-salir");
		int opcion = sc.nextInt();

		return opcion;
	}

	static void verHotel() {
		for (Habitacion habitacion : habitaciones) {
			if (habitacion.getLibreOcupada().equals("libre")) {
				System.out.println("HABITACIONES LIBRES " + habitacion.toString());
			} else {
				System.out.println("HABITACIONES OCUPADAS " + habitacion.toString());
			}

		}
	}

}
