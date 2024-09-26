package hotel;

public class Dobles extends Habitacion {
	private static int numeroDePlazas = 10;
	private int precio;
	private long timepo;
	private String clase;

	

	public Dobles(String clase, int precio, String libreOcupada, int tiempo) {
		super(clase, precio, libreOcupada, tiempo);

	}

	public static void setNumeroDePlazas(int numeroDePlazas) {
		Dobles.numeroDePlazas = numeroDePlazas;
	}

	public static int getNumeroDePlazas() {
		return numeroDePlazas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public long getTimepo() {
		return timepo;
	}

	public void setTimepo(long timepo) {
		this.timepo = timepo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

}
