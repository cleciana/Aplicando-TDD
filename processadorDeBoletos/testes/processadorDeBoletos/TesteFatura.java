package processadorDeBoletos;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TesteFatura {
	
	Fatura fatura1, fatura2;
	Boleto boleto1, boleto2, boleto3, boleto4;
	ArrayList<Boleto> boletos1, boletos2;
	
	@Before
	public void before() {
		fatura1 = new Fatura(LocalDate.now(), 1500.00, "Marcelinho");
		fatura2 = new Fatura(LocalDate.now(), 700.00, "Laurinha Lero");
		boleto1 = new Boleto(LocalDate.now(), 400.00);
		boleto2 = new Boleto(LocalDate.now(), 500.00);
		boleto3 = new Boleto(LocalDate.now(), 600.00);
		boleto4 = new Boleto(LocalDate.now(), 550.00);
		boletos1 = new ArrayList<Boleto>();
		boletos2 = new ArrayList<Boleto>();
		boletos1.add(boleto1);
		boletos1.add(boleto2);
		boletos1.add(boleto3);
		boletos2.add(boleto4);
		
	}

	@Test
	public void testePagamentoTotal() {
		fatura1.processaPagamentos(boletos1);
		assertEquals("PAGA", fatura1.getStatus());
	}
	
	@Test
	public void testePagamentoParcial() {
		fatura2.processaPagamentos(boletos2);
		assertEquals("ABERTA", fatura2.getStatus());
	}
	
	@Test
	public void testePagamentosCriados() {
		fatura1.processaPagamentos(boletos1);
		assertEquals(3, fatura1.getPagamentos().size());
	}
}