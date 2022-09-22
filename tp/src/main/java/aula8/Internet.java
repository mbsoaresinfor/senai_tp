package aula8;

public class Internet implements TotalCompras{

	private int total;
	
	public void realizandoCompras(int valor) {
		total = total + valor;
	}
	
	@Override
	public int totalCompras() {
		return total;
	}

}
