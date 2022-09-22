package aula8;

public class PedidoFacade {

	private ModuloEstoque moduloEstoque = new ModuloEstoque();
	private ModuloFinanceiro moduloFinanceiro = new ModuloFinanceiro();
	private ModuloPosVenda modPosVenda = new ModuloPosVenda();
	
	public void executaPedido(Pedido pedido) {
		moduloEstoque.enviarPedido(pedido);
		moduloFinanceiro.faturar(pedido);
		modPosVenda.agendarContatoCliente(pedido);
	}
	
}
