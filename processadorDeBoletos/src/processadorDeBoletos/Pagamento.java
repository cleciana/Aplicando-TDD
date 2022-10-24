package processadorDeBoletos;

public class Pagamento {

	private double valorPago;
	
	public Pagamento(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValorPago() {
		return this.valorPago;
	}

	public void setValorPago(double valor) {
		this.valorPago = valor;		
	}
}
