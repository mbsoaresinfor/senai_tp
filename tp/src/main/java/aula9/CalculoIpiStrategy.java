package aula9;

public class CalculoIpiStrategy 
		implements CalculoImposto{

	@Override
	public double calcular(double valor) {
		return valor + 5;
	}

}
