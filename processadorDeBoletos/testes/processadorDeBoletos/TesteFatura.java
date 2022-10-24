package processadorDeBoletos;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TesteFatura {
	
	Fatura fatura1;
	Boleto boleto1, boleto2;
	ArrayList<Boleto> boletos1;
	
	@Before
	public void before() {
		fatura1 = new Fatura(LocalDate.now(), 1500.00, "João");
		boleto1 = new Boleto(LocalDate.now(), 700.00);
		boleto2 = new Boleto(LocalDate.now(), 800.00);
		boletos1 = new ArrayList<Boleto>();
		boletos1.add(boleto1);
		boletos1.add(boleto2);
	}
	
	@Test
	public void testPagamentoTotal() {
		fatura1.processaPagamentos(boletos1);
		assertEquals(0.00, fatura1.getValorTotal(), 0.00);
	}
	@Test
	public void testPagamentoParcial() {
		
	}
}
