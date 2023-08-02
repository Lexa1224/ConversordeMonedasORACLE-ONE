package currencyconversor;

public class Divisa {
	
	
	/*GETTERS AND SETTERS*/
	/**+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	private String nombreMoneda ;
	private double ValorMonedaOrigen ;
	
	
	/**
	 * {@summary}
	 * This variable save de value of the currency 
	 * for example a peso mexicano = 17.50
	 * 
	 * */
	private double ValorDeCambio;//AQUI ES DONDE SE GUARDA EL VALOR DE CAMBIO DE LA MONEDA
	
	private double ResultadoConversion;
	
	
		public String getNombreMoneda() {
		return nombreMoneda;
	}
	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}
	public double getValorMonedaOrigen() {
		return ValorMonedaOrigen;
	}
	public void setValorMonedaOrigen(double valorMonedaOrigen) {
		ValorMonedaOrigen = valorMonedaOrigen;
	}
	public double getValorDeCambio() {
		return ValorDeCambio;
	}
	public void setValorDeCambio(double valorDeCambio) {
		ValorDeCambio = valorDeCambio;
	}
	public double getResultadoConversion() {
		return ResultadoConversion;
	}
	public void setResultadoConversion(double resultadoConversion) {
		ResultadoConversion = resultadoConversion;
	}
		
	/*final de los getters and setters*/
	
	
	
	//Method that make the conversion
	public double conversion(double unidadesDeMonedaAconvertir) {
		this.ResultadoConversion = (unidadesDeMonedaAconvertir * this.ValorDeCambio);
		double numeroMultiplicado = this.ResultadoConversion*100;
		double resultadoRedondeado = Math.round(numeroMultiplicado);
		double resultado =resultadoRedondeado/100; 
		
		//return this.ResultadoConversion = ((unidadesDeMonedaAconvertir * this.ValorDeCambio)*100)/100;
		//return this.ResultadoConversion = (((unidadesDeMonedaAconvertir * this.ValorDeCambio)/100)*1000);
		return resultado;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//this method return the currency to orignal value
public double RetornarConversion(double unidadesDeMonedaAconvertir) {
	double retornoNumeroSinRedondeo =unidadesDeMonedaAconvertir/this.ValorDeCambio;
	double numeroMultiplicado = retornoNumeroSinRedondeo*100;
	double resultadoRedondeado = Math.round(numeroMultiplicado);
	double resultado =resultadoRedondeado/100;
	//return (((unidadesDeMonedaAconvertir/this.ValorDeCambio)*1000)/100);
	return resultado;
}


}
