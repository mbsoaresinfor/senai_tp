package aula16.dados;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraRepositorio {

	private List<OperacaoEntidade> lista =
			new ArrayList<>();
	
	public void salvar(OperacaoEntidade operacaoEntidade) {
		lista.add(operacaoEntidade);
	}
	
	public List<OperacaoEntidade> listar(){
		return lista;
	}
	
	
}
