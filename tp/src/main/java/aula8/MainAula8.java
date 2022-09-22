package aula8;

public class MainAula8 {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		PedidoFacade pedidoFacade = new PedidoFacade();
		pedidoFacade.executaPedido(pedido);
		
		NaRua naRua = new NaRua();
		naRua.realizarCompra(30);
		naRua.realizarCompra(40);
		naRua.realizarCompra(50);
		naRua.realizarCompra(50);
		
		Loja loja = new Loja();
		loja.comprar(10);
		loja.comprar(20);
		loja.comprar(5);
		loja.comprar(3);
		loja.comprar(2);
		
		Internet internet = new Internet();
		internet.realizandoCompras(100);
		internet.realizandoCompras(70);
		internet.realizandoCompras(1000);
		
		TotalComprasComposite composite = new TotalComprasComposite();
		composite.adicionarTotalCompras(internet);
		composite.adicionarTotalCompras(loja);
		composite.adicionarTotalCompras(naRua);
		int total = composite.retornarTotalComprasdoDia();
		System.out.println("Total compras dia R$ " + total);

	}

}
