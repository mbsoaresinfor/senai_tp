package aula9;

public class CartaoCreditoPagamentoStrategy
		implements FormaPagamento{

	@Override
	public double calcular(double valor) {		
		return valor + (valor * 0.05);
	}

}
