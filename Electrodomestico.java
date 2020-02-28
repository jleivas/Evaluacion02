package electrodomesticos;

public class Electrodomestico {

	/*
	 *  Constantes
	 */
	private final static int PRECIO_BASE = 100000;
	private final static String COLOR = "Blanco";
	private final static String CONSUMO_ENERGETICO = "F";
	private final static float PESO = 5;
/*
 * Atributos
 */
	private int precioBase;
	private String color;
	private String consumo_Energetico;
	private float peso;
/*
 *	Objeto para crear datos aleatorios 
 */
	Datos aleatorio = new Datos();
/*
 * Constructores
 */
	public Electrodomestico() {

		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumo_Energetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
	}

	public Electrodomestico(int precioBase, float peso) {

		this();
		this.precioBase = PRECIO_BASE;
		this.peso = Datos.azar(10, 100);
	}

	public Electrodomestico(int precioBase, String color, String consumo_Energetico, float peso) {

		this(precioBase, peso);
		this.color = comprobarColor(color);
		this.consumo_Energetico = comprobarConsumoEnergetico(consumo_Energetico);

	}

/*
 * Metodos	
 */
	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public String getConsumo_Energetico() {
		return consumo_Energetico;
	}

	public float getPeso() {
		return peso;
	}
/*
 * Se prefiere el uso de String para manejar correctarmente las funciones
 */
	private String comprobarConsumoEnergetico(String letra) {

		letra = aleatorio.getConsumo_Energetico();
		boolean encontrado = false;
		this.consumo_Energetico = "F";
		for (int i = 0; i < Datos.CONSUMO_ENERGETICO.length && !encontrado; i++) {
			if (Datos.CONSUMO_ENERGETICO[i].equals(letra)) {
				encontrado = true;
				this.consumo_Energetico = letra;
			}
		}
		return this.consumo_Energetico;
	}

	private String comprobarColor(String color) {

		color = aleatorio.getColor();
		boolean encontrado = false;
		this.color = "Blanco";
		for (int i = 0; i < Datos.COLORES.length && !encontrado; i++) {
			if (Datos.COLORES[i].equals(color)) {
				encontrado = true;
				this.consumo_Energetico = color;
			}
		}
		return this.color;
	}

	public void precioFinal() {

		for (int i = 0; i < 9; i++) {

		}

	}

	
	
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo_Energetico="
				+ consumo_Energetico + ", peso=" + peso + "]";
	}

	
}
