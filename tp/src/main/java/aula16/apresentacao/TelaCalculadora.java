package aula16.apresentacao;

import javax.swing.JOptionPane;

public class TelaCalculadora {

	public OperacaoDto mostraMenu() {
		
		String op = JOptionPane.
				showInputDialog("Digite a operacao [+,-]");
		
		String v1 = JOptionPane.
				showInputDialog("Digite o valor 1");
		
		String v2 = JOptionPane.
				showInputDialog("Digite o valor 2");
		
		OperacaoDto operacaoDto = new OperacaoDto();
		operacaoDto.setOperacao(op);
		operacaoDto.setValor1(v1);
		operacaoDto.setValor2(v2);
		return operacaoDto;
		
	}
	
}
