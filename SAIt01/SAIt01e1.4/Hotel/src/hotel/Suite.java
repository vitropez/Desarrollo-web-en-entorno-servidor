package hotel;

public class Suite extends Habitacion {

	private static int numeroDePlazas = 5;
	private int precio;
	private long timepo;
	private String clase;

	

	public Suite(String clase, int precio, String libreOcupada, long tiempo) {
		super(clase, precio, libreOcupada, tiempo);

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
