package aula9;

public class BoletoPagamentoStrategy
		implements FormaPagamento{

	@Override
	public double calcular(double valor) {		
		return valor;
	}

}
