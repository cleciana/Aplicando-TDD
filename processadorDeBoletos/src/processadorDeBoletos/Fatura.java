package processadorDeBoletos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fatura {
	
	private double valorTotal;
	
	public Fatura(LocalDate now, double valor, String cliente) {
		this.valorTotal = valor;
	}

	public double processaPagamentos(ArrayList<Boleto> boletos) {
		for (Boleto boleto : boletos) {
			this.valorTotal -= boleto.getValorPago();
		}
		return this.getValorTotal();
	}

	public double getValorTotal() {
		return this.valorTotal;
	}

	public String getStatus() {
		if (this.getValorTotal() == 0.00) {
			return "PAGA";
		}
		return "NAO PAGA";
	}

}
