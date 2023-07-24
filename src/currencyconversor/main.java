/**
 * CURRENCY CONVERSOR VESION 0.1
 */
package currencyconversor;

import java.util.Scanner;

/**
 * @author ALEX
 *
 */
public class main {
	
	public static void main(String[] args) {
	
	double ValorPesoMexicano = 17.05;//	
	double ValorPesoMexicanoAdolar = 0.05;
	int opcion = 2;
	double unidadesDeMonedaAconvertir = 1;
	double retorno=0;
	
	/*ZONA DE LECTURAS PARA LAS ENTRADAS DE LOS DATOS*/
	//creamos la clase scanner que leera los datos del usuario
	Scanner entrada = new Scanner(System.in);//OBJETO QUE MANEJARA LAS LECTURAS
	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	//Seleccionamos la opcion
	System.out.println("Seleccione una opcion \t 1)Dolares A pesos Mexicanos\t 2)Pesos Mexicanos A Dolares\n");
	opcion =entrada.nextInt();//Leemos la opcion del usuario
	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	
	
	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/		
		System.out.println("Ingrese la cantidad de dinero que desea convertir");
	unidadesDeMonedaAconvertir=entrada.nextDouble();//leemos la cantidad de dinero a convertir
	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
	/*FINALIZA LA ENTRADA DE LOS DATOS*/

		
		
		
		
		
	switch (opcion) {
	case 1:
		//Creamos las intancias de las diferentes monedas
				Divisa DolarAPesoMexicano = new Divisa();//Creamos el peso mexicano
				DolarAPesoMexicano.setValorDeCambio(ValorPesoMexicano);//le asignamos el valor de un peso mexicanos
				retorno=DolarAPesoMexicano.conversion(unidadesDeMonedaAconvertir);//Llamamos al metodo conversion
				System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" dolares  a " +retorno+" pesos mexicanos ");//imprimimos el resultado
			
				
		break;
	case 2:
		
		Divisa PesoMexicanoAdolar = new Divisa(); 
		PesoMexicanoAdolar.setValorDeCambio(ValorPesoMexicano);
		retorno = PesoMexicanoAdolar.RetornarConversion(unidadesDeMonedaAconvertir);
		System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();	
		
		break;

	default:
		break;
	}	
		
		
		
		
		
		
		
		
		
		

		
		
		
	}//final del main
	
	


}
