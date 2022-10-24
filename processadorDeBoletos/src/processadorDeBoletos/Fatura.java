package processadorDeBoletos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fatura {
	
	private double valorTotal;
	private String status;
	private ArrayList<Pagamento> pagamentos;
	
	public Fatura(LocalDate data, double valor, String cliente) {
		this.valorTotal = valor;
		this.pagamentos = new ArrayList<Pagamento>();
		this.status= "ABERTA";
	}

	public void processaPagamentos(ArrayList<Boleto> boletos) {
		
		double totalPagamentos = 0.00;
		
		for (Boleto boleto : boletos) {
			
			double valorPagamento = boleto.getValorPago();
			
			Pagamento novoPagamento = new Pagamento(valorPagamento);
			this.pagamentos.add(novoPagamento);
			
			totalPagamentos += valorPagamento;
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

	public ArrayList<Pagamento> getPagamentos() {
		return this.pagamentos;
	}

}
