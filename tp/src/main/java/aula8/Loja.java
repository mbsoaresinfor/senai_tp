package aula8;

public class Loja implements TotalCompras{

	private int total;
	
	public void comprar(int valor) {
		total = total + valor;
	}
	
	@Override
	public int totalCompras() {
		return total;
	}

}
