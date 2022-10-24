package processadorDeBoletos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fatura {
	
	private double valorTotal;
	private String status = "ABERTA";
	
	public Fatura(LocalDate now, double valor, String cliente) {
		this.valorTotal = valor;
	}

	public void processaPagamentos(ArrayList<Boleto> boletos) {
		double totalPagamentos = 0.00;
		for (Boleto boleto : boletos) {
			totalPagamentos += boleto.getValorPago();
		}
		if (totalPagamentos == this.getValorTotal()) {
			this.status = "PAGA";
		}
	}

	public double getValorTotal() {
		return this.valorTotal;
	}

	public String getStatus() {
		return this.status;
	}

}
