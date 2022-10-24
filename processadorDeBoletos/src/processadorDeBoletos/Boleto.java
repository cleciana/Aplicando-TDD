package processadorDeBoletos;

import java.time.LocalDate;

public class Boleto {

	private double valorPago;
	
	public Boleto(LocalDate now, double valor) {
		this.valorPago = valor;
	}

	public double getValorPago() {
		return this.valorPago;
	}

}
