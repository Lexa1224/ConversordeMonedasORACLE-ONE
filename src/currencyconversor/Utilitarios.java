package currencyconversor;

import javax.swing.JOptionPane;

public class Utilitarios {

	public Utilitarios() {
		// TODO Auto-generated constructor stub
	}
	
	//This class content the utilitaries tools as main menu
	
	
	/**
	 * This Method show the main menu
	 * */
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
	
	
	
	
	
	/**
	 * This methos content the option to show 
	 * */
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
	}//END OF METHOD
	
	
	
	
	
	public static double UnidadesAconvertir() {
		/**
		 * Este metodo hace la lectura de las unidades de moneda a convertir
		 */
		double Unidades = 0;
		String lectura = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir\n ");
		try {
			Unidades = Double.parseDouble(lectura);// Convertimos la entrada del usuario en formato double
			// System.out.println(Unidades*2);
		} catch (Exception e) {
			// System.out.println("No se puede convetir");//si el usuario comete un error el
			// programa no se detiene
			JOptionPane.showMessageDialog(null, "No se puede convertir");
			cierra("El programa no convertirá");
			
			// TODO: handle exception
		}
		return Unidades;// Regresa la cantidad de dinero a convertir
	}
	
	
	
	

	public static void resultados(double conversion, String moneda) {

		// double redondeo = (conversion/100)*100;
		JOptionPane.showMessageDialog(null, "Tienes " + conversion + " " + moneda);
	}
	
	
	

	public static int continuar() {
		int continua = JOptionPane.showConfirmDialog(null, "¿Deseas hacer otra conversion?");
		System.out.println(continua);
		return continua;

	}
	
	
	public static void cierra(String detalle) {
		JOptionPane.showMessageDialog(null, detalle);
		System.exit(0);// cerramos todos los recursoS
	}
	
	
	
	
	
	
	
	
	
}//END OF CLASS
