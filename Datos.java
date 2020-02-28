package electrodomesticos;

public class Datos {
/*
 * Constantes
 */
	public static final String[] COLORES = { "Blanco", "Negro", "Rojo", "Azul", "Gris" };
	public static final String[] CONSUMO_ENERGETICO = { "A", "B", "C", "D", "E", "F" };
	public static final String[] ELECTRODOMESTICOS = {"Electrodomestico", "Lavadora", "Television"};
/*
 * Atributos
 */
	private String color;
	private String consumo_energetico;
	private String articulo;
/*
 * Constructores
 */
	public Datos() {

		this.generarColor();
		this.generarConsumo_Energetico();
		this.generarArticulo();
	}

	private void generarColor() {

		this.color = COLORES[(int) (Math.random() * COLORES.length)];
	}

	private void generarConsumo_Energetico() {

		this.consumo_energetico = CONSUMO_ENERGETICO[(int) (Math.random() * CONSUMO_ENERGETICO.length)];
	}

	private void generarArticulo() {
		this.articulo = ELECTRODOMESTICOS[(int) (Math.random() * ELECTRODOMESTICOS.length)];
	}
	
	public String getColor() {

		return this.color;
	}

	public String getConsumo_Energetico() {

		return this.consumo_energetico;
	}
	
	public String getArticulo() {
		return this.articulo;
	}

	public static int azar(int desde, int hasta) {
		int azar = (int) (Math.random() * (hasta + 1 - desde)) + desde; //
		return azar;
	}

}
