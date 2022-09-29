package aula9;

public class FormaPagamentoContext {

	public static final int CARTAO_CREDITO = 1;
	public static final int CARTAO_DEBITO = 2;
	public static final int BOLETO = 3;
	
	public FormaPagamento getStrategy(int tipo) {
		if(CARTAO_CREDITO == tipo) {
			return new CartaoCreditoPagamentoStrategy();
		}
		if(CARTAO_DEBITO == tipo) {
			return new CartaoDebitoPagamentoStrategy();
		}
		if(BOLETO == tipo) {
			return new BoletoPagamentoStrategy();
		}
		throw new IllegalArgumentException("error");
	}
	
}
