package processadorDeBoletos;

import java.time.LocalDate;

public class Boleto {
	private int codigo = 0;
	private LocalDate data;
	private double valorPago;
	
	
	public Boleto(LocalDate data, double valor) {
		this.codigo = proxCodigo();
		this.data = data;
		this.valorPago = valor;
	}

	private int proxCodigo() {
		return this.codigo += 1;
	}

	public double getValorPago() {
		return this.valorPago;
	}
}
