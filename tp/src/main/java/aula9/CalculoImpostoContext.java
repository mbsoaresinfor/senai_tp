package aula9;

public class CalculoImpostoContext {

	public CalculoImposto getStrategy(String tipo) {
		if(tipo.equals("icms")) {
			return new CalculoIcmsStrategy();
		}
		if(tipo.equals("ipi")) {
			return new CalculoIpiStrategy();
		}
		throw new IllegalArgumentException("error");
	}
	
}
