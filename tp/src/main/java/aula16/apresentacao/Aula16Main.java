package aula16.apresentacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import aula16.negocio.CalculadoraServico;

public class Aula16Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		CalculadoraServico servico = new CalculadoraServico();
		
		//TelaCalculadora tela = new TelaCalculadora();
	    //OperacaoDto retornoDto = tela.mostraMenu();
		
		System.out.println("digite operacao");
		String op = teclado.next();
		System.out.println("digite valor 1");
		String v1 = teclado.next();
		System.out.println("digite valor 1");
		String v2 = teclado.next();
		
		OperacaoDto dto = new OperacaoDto();
		dto.setOperacao(op);
		dto.setValor1(v1);
		dto.setValor2(v2);
		
		try {
			float resultado = servico.realizarCalculo(dto);
			JOptionPane.showMessageDialog(null, resultado);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

}
