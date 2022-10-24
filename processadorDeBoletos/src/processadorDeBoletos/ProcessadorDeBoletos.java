package processadorDeBoletos;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProcessadorDeBoletos {

public void processaPagamentos(Fatura fatura, ArrayList<Boleto> boletos) {
		
		double totalPagamentos = 0.00;
		
		for (Boleto boleto : boletos) {
			
			double valorPagamento = boleto.getValorPago();
			
			Pagamento novoPagamento = new Pagamento(valorPagamento, LocalDate.now());
			fatura.getPagamentos().add(novoPagamento);
			
			totalPagamentos += valorPagamento;
		}
		
		if (totalPagamentos == fatura.getValorTotal()) fatura.setStatus("PAGA");		
	}
}
