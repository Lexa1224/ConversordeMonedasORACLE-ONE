package currencyconversor;

import java.util.Scanner;

public class Utilitarios {
	Scanner lectura = new Scanner(System.in);
	
	public float leerDatos() {
		float lecturas = lectura.nextFloat();
		return lecturas;
		
	}
	
	
	
	/*ESTE ES EL MENU DE CONSOLA*/
	public int menu() {
		int opcion =0;
		System.out.println("Seleccione una opcion del menu de conversion");
		System.out.println("1)DOLARES A PESOS\t 2)PESOS MEXICANOS A DOLARES ");
		opcion = (int)leerDatos();
		return opcion;
	}
	
	

	

}
