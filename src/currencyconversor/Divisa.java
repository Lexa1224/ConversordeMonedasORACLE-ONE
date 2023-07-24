package currencyconversor;

public class Divisa {
	
	
	/*GETTERS AND SETTERS*/
	/**+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	private String nombreMoneda ;
	private double ValorMonedaOrigen ;
	private double ValorDeCambio;
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
	
	
	//Method tha make the conversion
	public double conversion(double unidadesDeMonedaAconvertir) {
		
		
		return this.ResultadoConversion = ((unidadesDeMonedaAconvertir * this.ValorDeCambio)*100)/100;
	}

public double RetornarConversion(double unidadesDeMonedaAconvertir) {
	
	return unidadesDeMonedaAconvertir/this.ValorDeCambio;
}


}
