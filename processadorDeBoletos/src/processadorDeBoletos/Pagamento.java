package processadorDeBoletos;

import java.time.LocalDate;

public class Pagamento {

	private double valorPago;
	private LocalDate data;
	private String tipo;
	
	public Pagamento(double valorPago, LocalDate data) {
		this.valorPago = valorPago;
		this.data = data;
		this.tipo = "BOLETO";
	}

	public double getValorPago() {
		return this.valorPago;
	}
}
