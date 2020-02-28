package electrodomesticos;

public class Television extends Electrodomestico {
/*
 * Constantes
 */
	private final static float RESOLUCION = 20;
	private final static boolean SINTONIZADOR_TDT = false;
/*
 * Atributos
 */
	private float resolucion;
	private boolean sintonizadorTDT;
/*
 * Constructores
 */
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}

	public Television(int precioBase, float peso) {
		this();
	}

	public Television(int precioBase, String color, char consumo_Energetico, float peso) {
		this(precioBase, peso);
	}
/*
 * Metodos
 */
	public float getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + ", getPrecioBase()="
				+ getPrecioBase() + ", getColor()=" + getColor() + ", getConsumo_Energetico()="
				+ getConsumo_Energetico() + ", getPeso()=" + getPeso() + "]";
	}



}
