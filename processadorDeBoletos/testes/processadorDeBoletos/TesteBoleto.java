package processadorDeBoletos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteBoleto {

	@Test
	public void test() {
		Boleto boleto = new Boleto(500.00);
		assertTrue(boleto.getValorPago() == 500.00);
	}

}
