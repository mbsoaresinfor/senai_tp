package aula9;

import java.io.Console;
import java.util.Scanner;

public class MainAula9 {

	public static void main(String[] args) {

		CalculoImpostoContext contexto = new CalculoImpostoContext();
		CalculoImposto calculoIcms = contexto.getStrategy("icms");
		double valorImposto = 200;
		double valorImpostoCalculado = calculoIcms.calcular(valorImposto);
		System.out.println("calculo por icms " + valorImpostoCalculado);
		
		CalculoImposto calculoIpi = contexto.getStrategy("ipi");
		valorImpostoCalculado = calculoIpi.calcular(valorImposto);
		System.out.println("calculo por ipi " + valorImpostoCalculado);
		
		FormaPagamentoContext formaPagamentoContext = new FormaPagamentoContext();
		Scanner teclado =  new Scanner(System.in);
		while(true) {
			System.out.println("Digite o valor para calcular");
			Double valor = teclado.nextDouble();
			System.out.println("Digite o meio de pagamento\n"
					+ "1:cartao credito"
					+ "2:cartao debito"
					+ "3:boleto");
			int meioPagamento = teclado.nextInt();
			
			FormaPagamento formaPagamentoStrategy = formaPagamentoContext
					.getStrategy(meioPagamento);
			double resultado = formaPagamentoStrategy.
					calcular(valor);
			System.out.println("resultado " + resultado);
		
		}
		

	}

}
