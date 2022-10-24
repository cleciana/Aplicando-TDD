package processadorDeBoletos;

import java.time.LocalDate;

public class Boleto {
	private int codigoBoleto = 0;
	private LocalDate data;
	private double valorPago;
	
	
	public Boleto(LocalDate data, double valorPago) {
		this.codigoBoleto = proxCodigo();
		this.data = data;
		this.valorPago = valorPago;
	}

	private int proxCodigo() {
		return this.codigoBoleto += 1;
	}

	public double getValorPago() {
		return this.valorPago;
	}
}
