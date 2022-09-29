package aula9;

public class CartaoDebitoPagamentoStrategy 
		implements FormaPagamento{

	@Override
	public double calcular(double valor) {
		return valor + (valor * 0.02);
	}

}
