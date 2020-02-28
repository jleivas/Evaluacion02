package electrodomesticos;

import java.util.*;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Datos aleatorio = new Datos();
		Electrodomestico[] articulos = new Electrodomestico[10];
		
		escribir("--- MENU ---");
		escribir("1 - Cree articulos");
		escribir("2 - Muestre articulos");
		escribir("3 - Precio Final de Articulos");
	
		
		
		for (int i = 0; i < articulos.length; i++) {
			articulos[i] = new Electrodomestico();
			System.out.println(articulos[i]);
		}
		

	}
		
	
		
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}

}
