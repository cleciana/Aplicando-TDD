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
	ProcessadorDeBoletos processador;
	
	@Before
	public void before() {
		processador = new ProcessadorDeBoletos();
		fatura1 = new Fatura(LocalDate.now(), 1500.00, "Marcelinho");
		fatura2 = new Fatura(LocalDate.now(), 700.00, "Laurinha Lero");
		boleto1 = new Boleto(LocalDate.now(), 400.00);
		boleto2 = new Boleto(LocalDate.now(), 500.00);
		boleto3 = new Boleto(LocalDate.now(), 600.00);
		boletos1 = new ArrayList<Boleto>();
		boletos2 = new ArrayList<Boleto>();
		boletos1.add(boleto1);
		boletos1.add(boleto2);
		boletos1.add(boleto3);
		boletos2.add(boleto1);
	}

	@Test
	public void testePagamentoTotal() {
		processador.processaPagamentos(fatura1, boletos1);
		assertEquals("PAGA", fatura1.getStatus());
	}
	
	@Test
	public void testePagamentoParcial() {
		processador.processaPagamentos(fatura2, boletos2);
		assertNull(fatura2.getStatus());
	}
	
	@Test
	public void testePagamentosCriados() {
		processador.processaPagamentos(fatura1, boletos1);
		processador.processaPagamentos(fatura2, boletos2);
		assertEquals(3, fatura1.getPagamentos().size());
		assertEquals(1, fatura2.getPagamentos().size());
	}
}