/**
 * CURRENCY CONVERSOR VESION 0.1
 *  - Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano
 */
package currencyconversor;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author ALEX
 * @version 0.02 This is the second version of currency convertor by Alex
 *
 */
public class main {

	public static void main(String[] args) {

		/*
		 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 * +++++++
		 */
		int NuevaConversion = 0;// THIS VARIABLE MAINTAIN THE BUCLE ON
		int OpcionConversionSeleccionada = 0;// this variable content the choose of user from menu
		double ValorPesoMexicano = 17.05;// Almacena el valor de conversion del peso mexicano
		double ValorDeEuro = 0.90;
		double ValorLibraEsterlina = 0.78;
		double ValorYenJapones = 141.55;
		double ValorWonSurCoreano = 1280.71;

		double unidadesDeMonedaAconvertir = 1;// Almacena la cantidad de dinero a convertir
		double retorno = 0;

		// Make the instance of Utilitario
		Utilitarios Herramienta = Utilitarios();

		/* CALL OF THE MAIN MENU */
		
		/* ++++++++++++++++MOSTRAMOS EL MENU++++++++++++++++++++++ */
		while (NuevaConversion == 0) {
			OpcionConversionSeleccionada = Herramienta.MenuPrincipal();// this variable content the choose of user
			
			unidadesDeMonedaAconvertir = Herramienta.UnidadesAconvertir();
			

			System.out.println(unidadesDeMonedaAconvertir);
			/* ++++++++++++++++FIN DE MOSTRAMOS EL MENU++++++++++++++++++++++ */

			switch (OpcionConversionSeleccionada) { // Dependiendo de los valores recibidos en la lectura de opcion y
													// Unidades Creamos las instancias correspondientes

			/*
			 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><
			 * ><><><><><><><><><><><><><><><><><><><><>
			 */
			// Creamos las intancias de las diferentes monedas
			case 1:

				Divisa DolarAPesoMexicano = new Divisa();// Creamos el peso mexicano
				DolarAPesoMexicano.setValorDeCambio(ValorPesoMexicano);// le asignamos el valor de un peso mexicanos
				retorno = DolarAPesoMexicano.conversion(unidadesDeMonedaAconvertir);// Llamamos al metodo conversion
				System.out.println(
						"Convirtiendo " + unidadesDeMonedaAconvertir + " dolares  a " + retorno + " pesos mexicanos ");// imprimimos
																														// el
																														// resultado
				Herramienta.resultados(retorno, "Pesos Mexicanos");
				break;

			case 2:

				Divisa PesoMexicanoAdolar = new Divisa();
				PesoMexicanoAdolar.setValorDeCambio(ValorPesoMexicano);
				retorno = PesoMexicanoAdolar.RetornarConversion(unidadesDeMonedaAconvertir);
				// System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos a "
				// +retorno+" dolares ");//imprimimos el resultado
				// PesoMexicanoAdolar.RetornarConversion();
				Herramienta.resultados(retorno, "Dolares");

				break;

			/*
			 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><
			 * ><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
			 */

			/*
			 * +++++++++++++++++++++DOLARES A EUROS Y
			 * VICEVERSA++++++++++++++++++++++++++++++++++++++++++++++
			 */
			case 3:
				Divisa DolarAEuro = new Divisa();
				DolarAEuro.setValorDeCambio(ValorDeEuro);
				retorno = DolarAEuro.conversion(unidadesDeMonedaAconvertir);
				// System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos a "
				// +retorno+" dolares ");//imprimimos el resultado
				// PesoMexicanoAdolar.RetornarConversion();
				Herramienta.resultados(retorno, "Euros");

				break;
			case 4:
				Divisa EuroAdolar = new Divisa();
				EuroAdolar.setValorDeCambio(ValorDeEuro);
				retorno = EuroAdolar.RetornarConversion(unidadesDeMonedaAconvertir);
				// System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos a "
				// +retorno+" dolares ");//imprimimos el resultado
				// PesoMexicanoAdolar.RetornarConversion();
				Herramienta.resultados(retorno, "Dolares");
				break;
			/*
			 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			 * +++++++++++++++++++
			 */

			/*
			 * +++++++++++++++++++++DOLARES A LIBRAS ESTERLINEAS Y
			 * VICEVERSA++++++++++++++++++++++++++++++++++++++++++++++
			 */
			case 5:
				Divisa DolarALibraEsterlina = new Divisa();
				DolarALibraEsterlina.setValorDeCambio(ValorLibraEsterlina);
				retorno = DolarALibraEsterlina.conversion(unidadesDeMonedaAconvertir);
				// System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos a "
				// +retorno+" dolares ");//imprimimos el resultado
				// PesoMexicanoAdolar.RetornarConversion();
				Herramienta.resultados(retorno, "Libras Esterlinas");

				break;
			case 6:
				Divisa LibraEsterlinaADolar = new Divisa();
				LibraEsterlinaADolar.setValorDeCambio(ValorLibraEsterlina);
				retorno = LibraEsterlinaADolar.RetornarConversion(unidadesDeMonedaAconvertir);
				// System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos a "
				// +retorno+" dolares ");//imprimimos el resultado
				// PesoMexicanoAdolar.RetornarConversion();
				Herramienta.resultados(retorno, "Dolares");
				break;
			/*
			 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			 * +++++++++++++++++++
			 */

			/*
			 * +++++++++++++++++++++DOLARES A YEN JAPONES Y
			 * VICEVERSA++++++++++++++++++++++++++++++++++++++++++++++
			 */
			case 7:
				Divisa DolarAYenJapones = new Divisa();
				DolarAYenJapones.setValorDeCambio(ValorYenJapones);
				retorno = DolarAYenJapones.conversion(unidadesDeMonedaAconvertir);
				// System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos a "
				// +retorno+" dolares ");//imprimimos el resultado
				// PesoMexicanoAdolar.RetornarConversion();
				Herramienta.resultados(retorno, "Yenes Japoneses");

				break;
			case 8:
				Divisa YenJaponesADolar = new Divisa();
				YenJaponesADolar.setValorDeCambio(ValorYenJapones);
				retorno = YenJaponesADolar.RetornarConversion(unidadesDeMonedaAconvertir);
				// System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos a "
				// +retorno+" dolares ");//imprimimos el resultado
				// PesoMexicanoAdolar.RetornarConversion();
				Herramienta.resultados(retorno, "Dolares");
				break;
			/*
			 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			 * +++++++++++++++++++
			 */

			/*
			 * +++++++++++++++++++++DOLARES A WON SUL COREANO Y
			 * VICEVERSA++++++++++++++++++++++++++++++++++++++++++++++
			 */
			case 9:
				Divisa DolarAWonSulCoreano = new Divisa();
				DolarAWonSulCoreano.setValorDeCambio(ValorWonSurCoreano);
				retorno = DolarAWonSulCoreano.conversion(unidadesDeMonedaAconvertir);
				// System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos a "
				// +retorno+" dolares ");//imprimimos el resultado
				// PesoMexicanoAdolar.RetornarConversion();
				Herramienta.resultados(retorno, "Wones Sur Coreanos");

				break;
			case 10:
				Divisa WonSulCoreanoADolar = new Divisa();
				WonSulCoreanoADolar.setValorDeCambio(ValorWonSurCoreano);
				retorno = WonSulCoreanoADolar.RetornarConversion(unidadesDeMonedaAconvertir);
				// System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos a "
				// +retorno+" dolares ");//imprimimos el resultado
				// PesoMexicanoAdolar.RetornarConversion();
				Herramienta.resultados(retorno, "Dolares");
				break;
			/*
			 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			 * +++++++++++++++++++
			 */

			default:
				break;
			}
			/*
			 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			 * +++++++++++++++++++++++++++
			 */

			NuevaConversion = Herramienta.continuar();// llamamos al metodo continuar para validad si desea hacer una nueva
											// conversion
		} // final del bucle de cotinuidad

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * +++++++++++++++++++++++CERRAMOS ELPROGRAMA+++++++++++++++++++++++++++++++++++++
		 */
		Herramienta.cierra("Gracias por utilizar nuestro programa");

	}// final del main
	
	
	
	
	
	
	
	
	
	

	private static Utilitarios Utilitarios() {
		// TODO Auto-generated method stub
		return null;
	}



}// END OF MAIN CLASS
