/**
 * 
 */
package currencyconversor;

import java.util.Scanner;

/**
 * @author ALEX
 *
 */
public class main {

	public static float LecturasUsuarios() {
		Scanner lecturas = new Scanner(System.in);
		float lectura =lecturas.nextFloat();
		return lectura;
	}
	
	
	public static void main(String[] args) {
		int opcion = 0;
		float valorPeso = 17.05f;
		float valorDolar = 1;
		float unidadesAconvertir = 0;
		//Creando instancia para peso mexicano
		PesoMexicano pesoMexico = new PesoMexicano();

		
		System.out.println("Hola bienvenido al conversor\n");
			
		//Creamos la instancia de peso mexicano
		
		

		System.out.println("Bienvenido al conversor de alura Ones Challenge grupo 5\n");//Saludo principal
		System.out.println("Elija la opcion de conversion\n");//Primer etapa de menu
		System.out.println("1) Pesos A Dolares \t 2) Dolares A pesos\n");//Opciones disponibles
		opcion = (int) LecturasUsuarios();
		
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		//THIS BUCLE MAKE THE VALIDATION OF THE USER CHOOSE
		while(opcion <=0 || opcion >4 ) {
			System.out.println("Opcion Invalida intente de nuevo\n");
			opcion = (int) LecturasUsuarios();
		}
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		System.out.println("Opcion seleccionada "+opcion+"\n");
		System.out.println("Ingrese la cantidad de unidades de la moneda que quiere convertir\n");
		unidadesAconvertir = (float)LecturasUsuarios();
		System.out.println(unidadesAconvertir);
		
		
		
		
		
		
		
		
		
		
		
		
		switch (opcion) {
		case 1:
			
			System.out.println("Conversion de pesos a dolares\n");
			pesoMexico.setValorOriginal(valorPeso);
			System.out.println(pesoMexico.getValorOriginal());
			pesoMexico.setCantidadAconvertir(unidadesAconvertir);
			pesoMexico.HacerConversion();
			System.out.println("La conversion de "+unidadesAconvertir+" dolares da como resultado "+pesoMexico.getValorFinal()+"pesos Mexicanos \n");
						
			break;

		default:
			break;
		}//final del if
		
		
	}//final del main
	
	


}
