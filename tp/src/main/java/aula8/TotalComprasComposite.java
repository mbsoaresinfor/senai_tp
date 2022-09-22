package aula8;

import java.util.ArrayList;

public class TotalComprasComposite {

	ArrayList<TotalCompras> lista = new ArrayList<>();
	
	public void adicionarTotalCompras(TotalCompras totalCompras) {
		lista.add(totalCompras);
	}
	
	public int retornarTotalComprasdoDia() {
		int total = 0;
		for(TotalCompras totalCompras : lista) {
			total = total + totalCompras.totalCompras();
		}
		return total;
	}
	
	
}
