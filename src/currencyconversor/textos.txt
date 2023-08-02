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
 * @version 0.01
 * This is the first version of currency convertor by Alex
 *
 */
public class main {
	
	public static void main(String[] args) {
		
	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	int OpcionConversionSeleccionada=0;//Almacena la opcion seleccionada por el usuario en el menu de conversion 
	double ValorPesoMexicano = 17.05;//	Almacena el valor de conversion del peso mexicano
	double ValorDeEuro = 0.90;
	double ValorLibraEsterlina = 0.78;
	double ValorYenJapones= 141.55;
	double ValorWonSurCoreano = 1280.71;
	int NuevaConversion = 0;
	double unidadesDeMonedaAconvertir = 1;//Almacena la cantidad de dinero a convertir
	double retorno=0;
	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	
	
	
	
	
	
	
	
	
	
/*++++++++++++++++MOSTRAMOS EL MENU++++++++++++++++++++++*/	
while(NuevaConversion==0)		{

	OpcionConversionSeleccionada= MenuPrincipal();
	unidadesDeMonedaAconvertir = UnidadesAconvertir();//Cantidad de dinero a converir
	
	System.out.println(unidadesDeMonedaAconvertir);
/*++++++++++++++++FIN DE MOSTRAMOS EL MENU++++++++++++++++++++++*/
	
	
	
	
	

	
	
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	switch (OpcionConversionSeleccionada) {	//Dependiendo de los valores recibidos en la lectura de opcion y Unidades Creamos las instancias correspondientes

	//Creamos las intancias de las diferentes monedas
	case 1:
	
				Divisa DolarAPesoMexicano = new Divisa();//Creamos el peso mexicano
				DolarAPesoMexicano.setValorDeCambio(ValorPesoMexicano);//le asignamos el valor de un peso mexicanos
				retorno=DolarAPesoMexicano.conversion(unidadesDeMonedaAconvertir);//Llamamos al metodo conversion
				System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" dolares  a " +retorno+" pesos mexicanos ");//imprimimos el resultado		
				resultados(retorno,"Pesos Mexicanos");
		break;
		
	case 2:
		
		Divisa PesoMexicanoAdolar = new Divisa(); 
		PesoMexicanoAdolar.setValorDeCambio(ValorPesoMexicano);
		retorno = PesoMexicanoAdolar.RetornarConversion(unidadesDeMonedaAconvertir);
		//System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();
		resultados(retorno,"Dolares");
		
		break;
		
/*+++++++++++++++++++++DOLARES A EUROS Y VICEVERSA++++++++++++++++++++++++++++++++++++++++++++++*/
	case 3:
		Divisa DolarAEuro = new Divisa(); 
		DolarAEuro.setValorDeCambio(ValorDeEuro);
		retorno = DolarAEuro.conversion(unidadesDeMonedaAconvertir);
		//System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();
		resultados(retorno,"Euros");
		
		break;
	case 4:
		Divisa EuroAdolar = new Divisa(); 
		EuroAdolar.setValorDeCambio(ValorDeEuro);
		retorno = EuroAdolar.RetornarConversion(unidadesDeMonedaAconvertir);
		//System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();
		resultados(retorno,"Dolares");
		break;
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/	
		
		
		/*+++++++++++++++++++++DOLARES A LIBRAS ESTERLINEAS Y VICEVERSA++++++++++++++++++++++++++++++++++++++++++++++*/
	case 5:
		Divisa DolarALibraEsterlina = new Divisa(); 
		DolarALibraEsterlina.setValorDeCambio(ValorLibraEsterlina);
		retorno = DolarALibraEsterlina.conversion(unidadesDeMonedaAconvertir);
		//System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();
		resultados(retorno,"Libras Esterlinas");
		
		break;
	case 6:
		Divisa LibraEsterlinaADolar = new Divisa(); 
		LibraEsterlinaADolar.setValorDeCambio(ValorLibraEsterlina);
		retorno = LibraEsterlinaADolar.RetornarConversion(unidadesDeMonedaAconvertir);
		//System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();
		resultados(retorno,"Dolares");
		break;
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/	
		
				
		
		
		
		/*+++++++++++++++++++++DOLARES A YEN JAPONES Y VICEVERSA++++++++++++++++++++++++++++++++++++++++++++++*/
	case 7:
		Divisa DolarAYenJapones = new Divisa(); 
		DolarAYenJapones.setValorDeCambio(ValorYenJapones);
		retorno = DolarAYenJapones.conversion(unidadesDeMonedaAconvertir);
		//System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();
		resultados(retorno,"Yenes Japoneses");
		
		break;
	case 8:
		Divisa YenJaponesADolar = new Divisa(); 
		YenJaponesADolar.setValorDeCambio(ValorYenJapones);
		retorno = YenJaponesADolar.RetornarConversion(unidadesDeMonedaAconvertir);
		//System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();
		resultados(retorno,"Dolares");
		break;
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/	
		
				
		
		
		
		/*+++++++++++++++++++++DOLARES A WON SUL COREANO Y VICEVERSA++++++++++++++++++++++++++++++++++++++++++++++*/
	case 9:
		Divisa DolarAWonSulCoreano = new Divisa(); 
		DolarAWonSulCoreano.setValorDeCambio(ValorWonSurCoreano);
		retorno = DolarAWonSulCoreano.conversion(unidadesDeMonedaAconvertir);
		//System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();
		resultados(retorno,"Wones Sur Coreanos");
		
		break;
	case 10:
		Divisa WonSulCoreanoADolar = new Divisa(); 
		WonSulCoreanoADolar.setValorDeCambio(ValorWonSurCoreano);
		retorno = WonSulCoreanoADolar.RetornarConversion(unidadesDeMonedaAconvertir);
		//System.out.println("Convirtiendo "+unidadesDeMonedaAconvertir+" pesos  a " +retorno+" dolares ");//imprimimos el resultado
		//PesoMexicanoAdolar.RetornarConversion();
		resultados(retorno,"Dolares");
		break;
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/					

	default:
		break;
	}	
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/	
		
NuevaConversion=continuar();//llamamos al metodo continuar para validad si desea hacer una nueva conversion
}//final del bucle de cotinuidad
		
		

		


/*+++++++++++++++++++++++CERRAMOS EL PROGRAMA+++++++++++++++++++++++++++++++++++++*/
JOptionPane.showMessageDialog(null,"Muchas gracias por utilizar mi software :D");
		System.exit(0);//cerramos todos los recurso
/*+++++++++++++++++++++++CERRAMOS EL PROGRAMA+++++++++++++++++++++++++++++++++++++*/		
		
	}//final del main	
	
	
	
	
	
	
public static int MenuPrincipal() {
		int opcionSeleccionada = 0;
		/*CREAMOS EL MENU PRINCIPAL DE SELECCION*/
		String []  opciones = {"Conversor de monedas"};//Mostramos la opciones disponibles de programa	
		String seleccion = (String) JOptionPane.showInputDialog(null,"Selecciona una opción:","Menu Principal",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
		
		/*CREAMOS LA CONDICION DE RETORNO*/
		//llamamos al metodo que selecciona el tipo de conversion a realizar que muestras las opciones disponibles de conversion
		opcionSeleccionada= SeleccionConversion();//Aca obtenemos la opcion de conversion que ha seleccionado el usuario
		return opcionSeleccionada;//retornamos la opcion seleccionada que se evaluará en el switch
	}

	
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
public static int SeleccionConversion() {
		/**
		 * Este metodo retorna la opcion de conversion seleccionada al menu principal 
		 * **/
		
		String[] opciones = { "Dolares a pesos mexicanos" ,"Pesos Mexicanos A dolares","Dolares A Euros","Euros A Dolares",
				"Dolares a libras Esterlinas","Libras Esterlinas a dolares",
				"Dolares  A Yenes Japones","Yenes Japones A Dolares",
				"Dolares A Wones Sul Coreanos", "Wones Sul Coreanos A Dolares"};// Mostramos la opciones
																							// disponibles
		String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción:", "Que deseas convertir",
				JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);// Capturamos la opcion seleccionada por el
																		// usuario		
		JOptionPane.showMessageDialog(null, "Convertiras "+seleccion);
		//Devolvemos segun la opcion seleccionada
		
		if(seleccion == "Dolares a pesos mexicanos") {
			return 1;
		}
		else if(seleccion == "Pesos Mexicanos A dolares") {
			return 2;
		}
		else if(seleccion == "Dolares A Euros") {
			return 3;
		}
		
		else if(seleccion == "Euros A Dolares") {
			return 4;
		}
		
		else if(seleccion == "Dolares a libras Esterlinas") {
			return 5;
		}
		
		else if(seleccion == "Libras Esterlinas a dolares") {
			return 6;
		}
		
		else if(seleccion == "Dolares  A Yenes Japones") {
			return 7;
		}
		
		else if(seleccion == "Yenes Japones A Dolares") {
			return 8;
		}
		
		
		
		else if(seleccion == "Dolares A Wones Sul Coreanos") {
			return 9;
		}
		
		else if(seleccion == "Wones Sul Coreanos A Dolares") {
			return 10;
		}
		
		
		
		
		
		return 0;
	}
	
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
public static double UnidadesAconvertir() {
		/**
		 * Este metodo hace la lectura de las unidades de moneda a convertir
		 * */
		double Unidades=0;
		String lectura = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir\n ");
		try {
			 Unidades = Double.parseDouble(lectura);//Convertimos la entrada del usuario en formato double
			//System.out.println(Unidades*2);
		} catch (Exception e) {
			//System.out.println("No se puede convetir");//si el usuario comete un error el programa no se detiene
			JOptionPane.showMessageDialog(null, "No se puede convertir");
			// TODO: handle exception
		}
		return Unidades;//Regresa la cantidad de dinero a convertir
	}
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
public static void resultados(double conversion,String moneda) {
	
	//double redondeo = (conversion/100)*100;
	JOptionPane.showMessageDialog(null,"Tienes "+conversion +" "+moneda);
}
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

public static int continuar() {
	int continua = JOptionPane.showConfirmDialog(null, "¿Deseas hacer otra conversion?");
	System.out.println(continua);
	return continua;
	
}



}//Final del metodo main
