package currencyconversor;
/*
 * objeto		
Divisa	Atributos	Descripcion
	Nombre	Contiene el nombre de la moneda
	Valor	Contiene el valor de la moneda
	Pais	Contiene el pais de la moneda
	ValorDeCambio	Almacena  El valor de cambio de la moneda
		
	Metodos	
	converDestino	Convierte la moneda original a un nuevo valor de cambio asignado por la variable valor de cambio
	ConverOrigen	Convierte la moneda cambiada a su valor por defecto

 * 
 * */

public class Divisa {
public Divisa() {
		// TODO Auto-generated constructor stub
	}
	//Variables que almacenan los datos
	private String Nombre;
	private String Pais;
	private float valorOriginal;//Es el valor original de conversion es decir 1 dolar = 17.05 pesos
	private float valorFinal;//Este es el valor de la moneda despues de la conversion
	private float cantidadAconvertir;//Es la cantidad de unidades de la moneda a convertir
	
	
	
	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	public float getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}
	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

	public float getCantidadAconvertir() {
		return cantidadAconvertir;
	}

	public void setCantidadAconvertir(float cantidadAconvertir) {
		this.cantidadAconvertir = cantidadAconvertir;
	}
	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	
	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	/*ESTE METODO CONVERTIRA Y DEVOLVERA LA MONEDA CONVERTIDA*/
	public float HacerConversion() {
		return this.valorOriginal*this.cantidadAconvertir;
	}
	
	
	
	
	
	
/***Estas lineas dan y obtiene el valor original de la moneda*/
	public float getValorOriginal() {
		return valorOriginal;
	}
	public void setValorOriginal(float valorOriginal) {
		this.valorOriginal = valorOriginal;
	}
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	

	


	
	
}
