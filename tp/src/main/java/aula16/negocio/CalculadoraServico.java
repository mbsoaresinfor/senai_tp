package aula16.negocio;

import org.modelmapper.ModelMapper;

import aula16.apresentacao.OperacaoDto;
import aula16.dados.CalculadoraRepositorio;
import aula16.dados.OperacaoEntidade;

public class CalculadoraServico {

	private CalculadoraRepositorio 
		calculadoraRepositoy = new CalculadoraRepositorio();
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public float 
			realizarCalculo(OperacaoDto operacaoDto) 
					throws Exception{
		
		if(isOperacaoValida(operacaoDto.getOperacao()) == false) {
			throw new Exception("Operacao invalida");
		}
		if(isNumero(operacaoDto.getValor1()) == false) {
			throw new Exception("valor 1 invalida");
		}
		if(isNumero(operacaoDto.getValor2()) == false) {
			throw new Exception("valor 2 invalida");
		}
		
		float resultado = calcular(operacaoDto);
		OperacaoEntidade operacaoEntidade = 
				toOperacaoEntidade(operacaoDto);
		operacaoEntidade.setResultado(resultado + "");
		calculadoraRepositoy.salvar(operacaoEntidade);
		
		return resultado;
	}
	
	
	
	private OperacaoEntidade toOperacaoEntidade(OperacaoDto dto) {
		return modelMapper.map(dto, OperacaoEntidade.class);
	}
	
//	private OperacaoEntidade converterParaOperacaoEntidade(OperacaoDto dto) {
//		OperacaoEntidade operacaoEntidade = new OperacaoEntidade();
//		operacaoEntidade.operacao = dto.operacao;
//		operacaoEntidade.valor1 = dto.valor1;
//		operacaoEntidade.valor2 = dto.valor2;
//		return operacaoEntidade;
//	}
	
	private float calcular(OperacaoDto operacaoDto) {
		if("+".equals(operacaoDto.getOperacao())) {
			return Float.parseFloat(operacaoDto.getValor1()) +
					Float.parseFloat(operacaoDto.getValor2());
		}
		else if("-".equals(operacaoDto.getOperacao())) {
			return Float.parseFloat(operacaoDto.getValor1()) -
					Float.parseFloat(operacaoDto.getValor2());
		}
		return -1;
		
	}
	
	private boolean isOperacaoValida(String operacao) {
		return "+".equals(operacao) || "-".equals(operacao);		
	}
	
	private boolean isNumero(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
