package aula9;

public class CalculoIcmsStrategy 
			implements CalculoImposto{

	@Override
	public double calcular(double valor) {
		return valor + 10;
	}

	
}
