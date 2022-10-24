package processadorDeBoletos;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TesteFatura {
	
	Fatura fatura1, fatura2;
	Boleto boleto1, boleto2, boleto3, boleto4, boleto5;
	ArrayList<Boleto> boletos;
	
	@Before
	public void before() {
		fatura1 = new Fatura(LocalDate.now(), 1500.00, "João");
		fatura2 = new Fatura(LocalDate.now(), 700.00, "Maria");
		boleto1 = new Boleto(LocalDate.now(), 400.00);
		boleto2 = new Boleto(LocalDate.now(), 500.00);
		boleto3 = new Boleto(LocalDate.now(), 600.00);
		boleto4 = new Boleto(LocalDate.now(), 550.00);
		boleto5 = new Boleto(LocalDate.now(), 200.00);
		boletos = new ArrayList<Boleto>();
	}

	@Test
	public void testPagamentoTotal() {
		boletos.add(boleto1);
		boletos.add(boleto2);
		boletos.add(boleto3);
		fatura1.processaPagamentos(boletos);
		assertEquals("PAGA", fatura1.getStatus());
	}
	
	@Test
	public void testPagamentoParcial() {
		boletos.add(boleto4);
		fatura2.processaPagamentos(boletos);
		assertEquals("ABERTA", fatura2.getStatus());
	}
	
}