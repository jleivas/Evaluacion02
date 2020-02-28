package electrodomesticos;

public class Lavadora extends Electrodomestico {
/*
 * Constantes
 */
	private final static int CARGA = 5;
/*
 * Atributos
 */
	private int carga;
/*
 * Constructores
 */
	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	public Lavadora(int precioBase, float peso) {
		this();
	}

	public Lavadora(int precioBase, String color, char consumo_Energetico, float peso) {
		this(precioBase, peso);
	}

/*
 * Metodos
 */
	public int getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", getPrecioBase()=" + getPrecioBase() + ", getColor()=" + getColor()
				+ ", getConsumo_Energetico()=" + getConsumo_Energetico() + ", getPeso()=" + getPeso() + "]";
	}

	
	
}
